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
saab saab
opel opel
bus bus
saab bus
opel bus
opel opel
opel opel
saab saab
bus bus
saab van
van van
saab van
van van
opel van
opel opel
bus bus
bus bus
opel opel
opel bus
bus van
van van
opel opel
van van
saab van
saab opel
saab saab
bus van
saab opel
bus bus
opel saab
van van
opel opel
saab bus
opel van
saab van
bus bus
saab saab
saab opel
bus bus
saab van
opel opel
van van
van van
opel saab
bus bus
bus bus
opel van
opel van
opel saab
van bus
bus bus
bus bus
opel van
saab saab
bus bus
van van
bus bus
van van
van bus
van van
saab saab
van van
saab saab
van van
bus bus
saab saab
bus bus
opel saab
saab opel
bus bus
van bus
bus bus
van bus
bus bus
bus bus
opel opel
van bus
bus bus
van van
van van
opel bus
saab van
saab bus
saab van
van van
