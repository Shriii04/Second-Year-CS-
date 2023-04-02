#Data visualisation

library(ggplot2)
d1<-read.csv("DS_HA.csv")
d2<-d1[,c(1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100)]
barchart<-ggplot(d2, aes(x = STATE,y=BIRTHS2010)) +geom_bar(stat ="identity")
print(barchart)
p1<-ggplot(d1, aes(x=DIVISION))+geom_histogram(color="black", fill="white")
print(p1)

#Data cleaning and Processing


#Hypothesis

cat("H0 : ESTIMATESBASE2010 = 200000")
cat("\nHa : ESTIMATESBASE2010 != 200000")
cat("\nalpha = 0.05")
observed<-mean(d2$ESTIMATESBASE2010)
cat("\nObserved = ",observed)
mean<-200000
n<-56   #No. of states
se<-sd(d2$ESTIMATESBASE2010)/sqrt(n)
cat("\nStandard error = ",se)
pv<-pnorm(observed,mean,se)
cat("\nP value = ",pv)
if(pv<0.05){
  cat("\nclaim to be rejected for significance level = 0.05")
}else{
  cat("\nclaim cannot be rejected for significance level = 0.05")
}

#SCATTERPLOT
p2<-ggplot(d1,aes(REGION,STATE))+geom_point(aes(color=REGION))+scale_x_log10()+scale_y_log10()+labs(x="REGION",y="STATE",title="SCATTERPLOT")
print(p2)
