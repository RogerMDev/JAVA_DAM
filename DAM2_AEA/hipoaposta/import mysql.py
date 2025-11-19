import mysql.connector
 
try:
    connexio = mysql.connector.connect(
        host='localhost',
        database='hipoaposta',  
        user='root',
        password='admin'
    )
    
    if connexio.is_connected():
        print("✓ Connexió exitosa!")
        cursor = connexio.cursor()
        
        cursor.execute("SELECT nom, ciutat FROM hipodrom")
        hipodrom = cursor.fetchone()
        print(f"Hipòdrom: {hipodrom[0]} ({hipodrom[1]})")
        
        cursor.execute("SELECT COUNT(*) FROM usuaris")
        print(f"Usuaris: {cursor.fetchone()[0]}")
        
        cursor.close()
        connexio.close()
        print("✓ Test completat!")
        
except Exception as e:
    print(f"✗ Error: {e}")
