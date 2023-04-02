#pollutant data set

f1<-read.csv("pollutant_csv.csv")
m<-mean(f1$Temp[f1$Month==6],na.rm=T)
cat("Mean of temp when month is 6:",m)
n<-nrow(f1)
cat("\nNo. of observation:",n)
lr<-tail(f1,2)
print(lr)
v<-f1$Ozone[47]
cat("\nValue of ozone in 47th row:",v)
ms<-sum(is.na(f1$Ozone))
cat("\nNo. of missing values in Ozone: ",ms)
mn<-mean(f1$Ozone,na.rm=T)
cat("\nMean of Ozone excluding missing values:",mn)
mn1<-mean(f1$Solar.R[f1$Ozone>30 & f1$Temp>90],na.rm=T)
cat("\nMean of solar.R for ozone > 30 and Temp>90",mn1)
mx <- max(f1$Ozone[f1$Month==5],na.rm=T)
cat("\nMaximum value of ozone in the month of may:",mx)

#Hair color data set

f2<-read.csv("hair_eye_color_csv.csv")
be<-sum(f2$Eye.Color=="Brown")
cat("\n\nNo. of people having brown eye color",be)
bh<-sum(f2$Hair.Color=="Blonde")
cat("\nNo. of people having blonde hair",bh)
bhbe<-sum(f2$Hair.Color=="Brown"&f2$Eye.Color=="Black")
cat("\nNo. of brown hair people having black eyes",bhbe)
ge<-(sum(f2$Eye.Color=="Green")/nrow(f2))*100
cat("\nPercentage of people with green eyes",ge)
rhbe<-((sum(f2$Hair.Color=="Red"& f2$Eye.Color=="Blue"))/nrow(f2))*100
cat("\nPercentage of people haveing red hair and blue eyes",rhbe)
cat("\n")

# germination Data set

f3<-read.csv("germination_csv.csv")
avg<-mean(f3$germinated[f3$Box=="Uncovered"&f3$water_amt==4],na.rm = T)
cat("\nAverage number of seeds germinated for the uncovered boxes with level of watering equal to 4:",avg)
meadian<-median(f3$germinated[f3$Box=="Covered"])
cat("\nMedian value for the data covered boxes:",meadian)

#BOXPLOT

library(ggplot2)
p<-ggplot(iris,aes(Sepal.Length,Species,fill=Species))+geom_boxplot(outlier.color = "red",outlier.size = 6,outlier.shape = 4)+labs(x="Sepallength",y="species",title="Boxplot")+coord_flip()+theme(legend.position = "none")
print(p)

#SCATTERPLOT

library(dslabs)
p1<-ggplot(murders,aes(population/10^6,total))+geom_point(aes(color=region))+scale_x_log10()+scale_y_log10()+geom_text(aes(label=abb),size=2,nudge_x = 0.025)+labs(x="POPULATION",y="TOTAL",title="SCATTERPLOT")
print(p1)






