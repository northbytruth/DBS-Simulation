
#
#	Initial data read and clean
#


#Configure working directory
#setwd("C:\\Users\\A\\Dropbox\\DBS_Project\\Code\\AranCode\\DBS_Data_Analysis")

#Read in the data   ->  x,y,z,color
#color reps the electric potential volts
#the domain is x/y/z  (cartesian)
#is limits of each dimension -20 to 20

data<-read.csv("test.csv")

#data<-read.csv("data_export280114.csv")

names(data)<-c("X","Y","Z","Potential")


data_test2<-read.csv("data_test2.csv")
#names(data_test2)<-c("X","Y","Z","Potential")


#subset data to focus in on an area
data_focus<-data_test2[data_test2$X<10&&data_test2$Y<10&&data_test2$Z<10,]

data_focus<-data[data$X<5&&data_test2$Y<5&&data_test2$Z<5,]


#generate the deltas? xyz

#example plots
