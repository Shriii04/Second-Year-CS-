f1<- read.csv("travelled abroad_csv.csv")

#Percentage of Indians who have travelled abroad 
percentage<-sum(f1$Travelledabroad=="Y")/nrow(f1)*100
cat("\nPercentage of people travelled abroad:",percentage)

#Probability
p<-percentage/100
cat("\nProability of success:",p)

#dbinom() is the function for finding prob. with Sbinomial distribution
#dbinom(k,n,p)
#Probability in a random sample from k=0 to k=10
k=0:10
pb<-dbinom(k,10,p)
cat("\nProbabilty for k=0 to 10 by Binomial Distribution: ",pb)

plot(k,pb,type="l")

k1=59:100
probin<- sum(dbinom(k1,100,p))
cat("\nProbability for k>=59 by BD ",probin)

#pnorm() is the function for finding prob. using normal distribution
#pnorm(observed,mean,sd)
#BD to ND 2 conditions
#1) np>10 and 2) n(1-p)>10
mean<-100*p  #mean = np
cat("\nMean:",mean)
sd1<-sqrt(mean*(1-p)) #standard deviation = root(mean(1-p))
cat("\nStandard Deviation:",sd1)
pronrm<-pnorm(59,mean,sd1,lower.tail = F)
cat("\nProbability for K>=59 by Normal Distribution",pronrm)
k2=0:100
d<-dbinom(k2,100,p)
plot(k2,d,type="l")


