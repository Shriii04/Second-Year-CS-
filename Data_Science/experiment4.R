#Simple Linear Regression
f<-read.csv("Toy_store.csv")
l1<-lm(Unitsales~Price,f)  #lm(y-variable~x-variable,filename)
s1<-summary(l1)
print(s1)

#Model => y = 114215.1 - 4913.7(price) {y=b0+b1x}

#plot Regression Line
library(ggplot2)
p<-ggplot(f,aes(Price,Unitsales))+geom_point()+geom_smooth(method=lm,formula=y~x,se=F,col="red")
print(p)

#printing predicted value
pred<-predict(l1)
print(pred)
e<-f$Unitsales-pred   #Error = Actual-predicted
print(e)

#Multiple Regression
l2<-lm(Unitsales~Price+Adexp+Promexp,f) #lm(y-variable~x1+x2+...xn,filename)
s2<-summary(l2)
print(s2)

#Model => {y=B0+B1x1+B2x2+...BnXn} 
      #y=-250968 - 5055.3(price) + 648(Axemp) + 1802.6(Promexp)

df1<-data.frame(Price=c(9.1,8.1),Adexp=c(52,50),Promexp=c(61,60))
pred1<-predict(l2,df1)
s<-cbind(df1,pred1)
print(s)
