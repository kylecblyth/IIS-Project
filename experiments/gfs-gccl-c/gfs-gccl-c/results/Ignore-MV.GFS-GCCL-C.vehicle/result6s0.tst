@relation  vehicle
@attribute COMPACTNESS integer[73,119]
@attribute CIRCULARITY integer[33,59]
@attribute DISTANCECIRCULARITY integer[40,112]
@attribute RADIUSRATIO integer[104,333]
@attribute PRAXISASPECTRATIO integer[47,138]
@attribute MAXLENGTHASPECTRATIO integer[2,55]
@attribute SCATTERRATIO integer[112,265]
@attribute ELONGATEDNESS integer[26,61]
@attribute PRAXISRECTANGULAR integer[17,29]
@attribute LENGTHRECTANGULAR integer[118,188]
@attribute MAJORVARIANCE integer[130,320]
@attribute MINORVARIANCE integer[184,1018]
@attribute GYRATIONRADIUS integer[109,268]
@attribute MAJORSKEWNESS integer[59,135]
@attribute MINORSKEWNESS integer[0,22]
@attribute MINORKURTOSIS integer[0,41]
@attribute MAJORKURTOSIS integer[176,206]
@attribute HOLLOWSRATIO integer[181,211]
@attribute class{van,saab,bus,opel}
@inputs COMPACTNESS,CIRCULARITY,DISTANCECIRCULARITY,RADIUSRATIO,PRAXISASPECTRATIO,MAXLENGTHASPECTRATIO,SCATTERRATIO,ELONGATEDNESS,PRAXISRECTANGULAR,LENGTHRECTANGULAR,MAJORVARIANCE,MINORVARIANCE,GYRATIONRADIUS,MAJORSKEWNESS,MINORSKEWNESS,MINORKURTOSIS,MAJORKURTOSIS,HOLLOWSRATIO
@outputs class
@data
bus van
van van
bus bus
saab van
van bus
opel saab
opel saab
saab saab
bus saab
saab saab
van van
opel saab
van bus
bus bus
saab saab
opel opel
van saab
saab opel
opel saab
saab opel
bus bus
saab saab
van van
bus bus
van van
opel opel
van van
saab van
saab van
saab saab
opel saab
saab saab
bus bus
van van
van van
opel saab
bus bus
opel saab
saab saab
van van
opel saab
opel saab
saab van
bus bus
opel saab
bus bus
van saab
bus van
opel saab
bus van
opel bus
bus bus
bus saab
opel opel
saab saab
saab saab
van van
bus bus
saab opel
bus bus
van van
opel saab
saab saab
van van
van van
bus bus
saab saab
saab bus
van van
bus saab
saab saab
bus bus
saab opel
van van
van van
bus bus
opel saab
bus bus
opel saab
opel saab
opel saab
bus bus
opel opel
van van
