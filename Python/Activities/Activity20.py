import pandas
# Read from excel file
dataframe = pandas.read_excel('../Inputs/sample.xlsx')

# Print dataframe
print(dataframe)

# Print number of rows and columns
print("Number of rows and columns in the table", dataframe.shape)
# Print data from the email column
print("Emails")
print(dataframe['Email'])
# Sort data from First name
print("Sorted data on FirstName")
print(dataframe.sort_values('FirstName'))