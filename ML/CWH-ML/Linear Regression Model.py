import numpy as np
import matplotlib as plt
from sklearn import linear_model, datasets
from sklearn.metrics import mean_squared_error

diabetes = datasets.load_diabetes()
#print(diabetes.keys())
#dict_keys(['data', 'target', 'frame', 'DESCR', 'feature_names', 'data_filename', 'target_filename', 'data_module'])
print(diabetes.data)
