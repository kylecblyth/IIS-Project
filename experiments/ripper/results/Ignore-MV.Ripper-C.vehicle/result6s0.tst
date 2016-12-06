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
bus saab
van van
bus bus
saab van
van van
opel opel
opel saab
saab opel
bus bus
saab saab
van van
opel saab
van van
bus bus
saab saab
opel opel
van opel
saab saab
opel saab
saab opel
bus bus
saab opel
van van
bus bus
van van
opel opel
van van
saab van
saab saab
saab opel
opel saab
saab opel
bus bus
van van
van van
opel opel
bus bus
opel opel
saab opel
van van
opel saab
opel saab
saab saab
bus bus
opel opel
bus bus
van van
bus bus
opel saab
bus bus
opel saab
bus bus
bus bus
opel opel
saab saab
saab van
van van
bus bus
saab opel
bus van
van van
opel opel
saab saab
van van
van van
bus bus
saab opel
saab saab
van van
bus saab
saab saab
bus bus
saab saab
van van
van van
bus bus
opel saab
bus bus
opel saab
opel saab
opel van
bus bus
opel saab
van van
