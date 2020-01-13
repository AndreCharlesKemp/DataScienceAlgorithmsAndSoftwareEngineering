# -*- coding: utf-8 -*-
"""
Created on Wed Sep 25 13:31:10 2019

@author: Michael
"""

from sklearn import datasets
iris = datasets.load_iris()
import matplotlib.pyplot as plt
import numpy as np
from sklearn.datasets import load_diabetes
from sklearn import linear_model

d = load_diabetes()
d_X = d.data[:, np.newaxis, 2]
dx_train = d_X[:-20]
dy_train = d.target[:-20]
dx_test = d_X[-20:]
dy_test = d.target[-20:]

lr = linear_model.LinearRegression()
lr.fit(dx_train, dy_train)

mse = np.mean((lr.predict(dx_test) - dy_test) **2)
lr_score = lr.score(dx_test, dy_test)

print(lr.coef_)
print(mse)
print(lr_score)

plt.scatter(dx_test, dy_test)
plt.plot(dx_test, lr.predict(dx_test), c = 'r')
plt.show()