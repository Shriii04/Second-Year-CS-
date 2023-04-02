f<-read.csv("Hypothesis_csv1.csv")
cat("Null hypothesis = 10000")
cat("\nAlternate Hypothesis < 10000")
cat("\nalpha = 0.05")
observed<-mean(f$Life_Hrs)
cat("\nObserved = ",observed)
mean<-10000
se<-sd(f$Life_Hrs)/sqrt(50)
cat("\nStandard error = ",se)
pv<-pnorm(observed,mean,se)
cat("\nP value = ",pv)
if(pv<0.05){
  cat("\nclaim to be rejected for significance level = 0.05")
}else{
  cat("\nclaim cannot be rejected for significance level = 0.05")
}
if(pv<0.01){
  cat("\nclaim to be rejected for significance level = 0.01")
}else{
  cat("\nclaim cannot be rejected for significance level = 0.01")
}

#Question 2

cat("\n\nNull hypothesis = 130")
cat("\nAlternate hypothesis != 130")
observed
mean1<-130
pv1<-pnorm(134,130,17/sqrt(35),lower.tail = F)*2
cat("\np-value",pv1)
if(pv1<0.05){
  cat("\nclaim to be rejected for significance level = 0.05")
}else{
  cat("\nclaim cannot be rejected for significance level = 0.05")
}
if(pv1<0.01){
  cat("\nclaim to be rejected for significance level = 0.01")
}else{
  cat("\nclaim cannot be rejected for significance level = 0.01")
}

