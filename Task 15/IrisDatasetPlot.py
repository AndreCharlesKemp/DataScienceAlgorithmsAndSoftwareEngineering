#import the dataset named Iris
from sklearn import datasets
iris = datasets.load_iris()


#import pyplot from the matplotlib 
import matplotlib.pyplot as plt
from sklearn.datasets import load_iris
import numpy as np

#generate 12 charts with x= 4, y = 3.
fig = plt.figure()
ax1 = plt.subplot(4, 3, 1)
ax2 = plt.subplot(4, 3, 2)
ax3 = plt.subplot(4, 3, 3)
ax4 = plt.subplot(4, 3, 4)
ax5 = plt.subplot(4, 3, 5)
ax6 = plt.subplot(4, 3, 6)
ax7 = plt.subplot(4, 3, 7)
ax8 = plt.subplot(4, 3, 8)
ax9 = plt.subplot(4, 3, 9)
ax10 = plt.subplot(4, 3, 10)
ax11 = plt.subplot(4, 3, 11)
ax12 = plt.subplot(4, 3, 12)

#Assign variables to the data you want to compare from Iris.
iris = load_iris()
data = np.array(iris['data']) # x-values
targets = np.array(iris['target']) # y-values

#Assign colours to the targets to populate the scatter plot
cd = {0: 'r', 1: 'b', 2: 'g'}
cols = np.array([cd[target] for target in targets])

#Populate the various scatter plots using
ax1.scatter(data[:,0], data[:,1], c = cols)
ax2.scatter(data[:,0], data[:,2], c = cols)
ax3.scatter(data[:,0], data[:,3], c = cols)
ax4.scatter(data[:,1], data[:,0], c = cols)
ax5.scatter(data[:,1], data[:,2], c = cols)
ax6.scatter(data[:,1], data[:,3], c = cols)
ax7.scatter(data[:,2], data[:,0], c = cols)
ax8.scatter(data[:,2], data[:,1], c = cols)
ax9.scatter(data[:,2], data[:,3], c = cols)
ax10.scatter(data[:,3], data[:,0], c = cols)
ax11.scatter(data[:,3], data[:,1], c = cols)
ax12.scatter(data[:,3], data[:,2], c = cols)
plt.show() #Show the plots