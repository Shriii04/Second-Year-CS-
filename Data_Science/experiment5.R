f1<-read.csv("knn1_csv.csv")
ed<-sqrt((f1$x-3)**2+(f1$y-2)**2)
f1<-cbind(f1,ed)
#print(f1)
f1_sort<-f1[order(f1$ed),]# to arrange in ascending order acc to ed

#NN algorithm
cat("Class of P for NN is",f1_sort[1,4])

#KNN algorithm for k=5
df1<-f1_sort[1:5,]
l1<-sum(df1$class==1)
l2<-sum(df1$class==2)
l3<-sum(df1$class==3)
if(l1>l2 &l1>l3){
  cat("\nClass of P for KNN is",1)
}else if(l2>l3 & l2>l1){
  cat("\nClass of P for KNN is",2)
}else{
  cat("\nClass of P for KNN is",3)
}

#RNN algorithm for r=1.45
df2<-f1_sort[f1_sort$ed<1.45,]
l11<-sum(df2$class==1)
l21<-sum(df2$class==2)
l31<-sum(df2$class==3)

if(l11>l21 &l11>l31){
  cat("\nClass of P for RNN is",1)
}else if(l21>l31 & l21>l11){
  cat("\nClass of P for RNN is",2)
}else{
  cat("\nClass of P for RNN is",3)
}

