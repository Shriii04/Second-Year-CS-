#accuracy = TP+TN/TP+TN+FN+FP = sum(diagonal(t))/sum(t)
#sensitivity = TP/TP+FP = t[2,2]/sum(t[2,])
#precision = TP/TP+FP = t[2,2]/sum(t[,2])
#Specificity = TN/TN+FP = t[1,1]/sum(t[1,])

library(class) #for knn

f1<-read.csv("wbc_csv.csv")
f1$diagnosis<-as.factor(f1$diagnosis)

#sample() -- function to generate random numbers
#if we use set.seed(memory location) and then sample then same random numbers will be generated

set.seed(123)
f1_new<-f1[sample(nrow(f1)),] #contains shuffled data
f1_mod<-f1_new[,3:32]
n<-function(b){
  (b-min(b))/(max(b)-min(b))
}
f1_nor<-as.data.frame(lapply(f1_mod,n))

#splitting data into train and test
f1_train<-f1_nor[1:469,]
f1_test<-f1_nor[470:569,]
f1_trainlabel<-f1_new[1:469,2]
f1_testlabel<-f1_new[470:569,2]
p<-knn(f1_train,f1_test,f1_trainlabel,f1_testlabel,k=7)
t<-table(actual=f1_testlabel,predicted=p)
print(t)

#confusionMatrix(actual,predicted)

acc<-sum(diag(t))/sum(t)
cat("Accuracy is",acc)
sen<-t[2,2]/sum(t[2,])
cat("\nSensitivity is",sen)
pre<-t[2,2]/sum(t[,2])
cat("\nPrecision is",pre)
spe<-t[1,1]/sum(t[1,])
cat("\nSpecificity is",spe)



