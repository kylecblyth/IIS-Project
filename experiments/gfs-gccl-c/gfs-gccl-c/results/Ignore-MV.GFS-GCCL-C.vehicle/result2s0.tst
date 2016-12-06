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
van bus
bus bus
saab van
opel van
saab opel
bus bus
opel opel
van van
van van
bus bus
opel opel
van van
van van
bus bus
van van
bus bus
opel opel
van van
saab saab
opel van
bus bus
van van
opel bus
bus bus
bus bus
opel van
saab saab
van van
van van
van van
saab opel
saab bus
saab opel
bus bus
bus bus
opel saab
opel bus
opel van
van van
bus bus
bus van
bus bus
van van
bus saab
saab opel
van van
bus bus
bus bus
saab opel
saab bus
van van
opel opel
opel opel
saab opel
van van
saab opel
opel bus
opel van
opel bus
van van
opel saab
saab opel
saab saab
bus bus
bus bus
saab saab
opel saab
saab saab
saab saab
bus bus
saab saab
opel bus
saab opel
bus bus
saab opel
van van
opel saab
saab opel
bus bus
van van
opel van
bus bus
opel saab
saab saab
van van
