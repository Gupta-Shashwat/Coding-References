import numpy as np
from sklearn import datasets

diabetes = datasets.load_diabetes()
#print(diabetes.keys())
#dict_keys(['data', 'target', 'frame', 'DESCR', 'feature_names', 'data_filename', 'target_filename', 'data_module'])
diabetes_X = diabetes.data[:, np.newaxis, 0]

