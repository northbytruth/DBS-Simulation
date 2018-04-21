#
#   Set Routine: Plot countour map of data_export280114.csv
#
#

# Load in data
#
data<-read.csv("data_export280114.csv")

# Will have to setup factors
#
#   limits are XYZ: -20/20

#xyz_breaks<-seq(-20,20,1)

names(data)<-c("X","Y","Z","Potential","Xran","Yran","Zran")

# Convert data format to plottable matrix

#   Need to reclassify into a linear x/y/z scale
#   average points for each point - 80000 20by20by20, resolution of 0.1mm
#   use 3d array()

# X/Y plane 1




# Plot matrix



