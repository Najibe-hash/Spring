
# 🚀 Spring Boot + Jenkins + Docker + Open Liberty

Ce projet est une application **Spring Boot** simple exposant une API REST (`/api/hello`) et déployée automatiquement grâce à **Jenkins** dans un environnement **Docker** avec **Open Liberty**.

---

## 📦 Fonctionnalités

- API REST : `GET /api/hello` → retourne "Hello, World"
- Build Maven (`mvn clean package`)
- Déploiement automatique avec Jenkins via pipeline
- Conteneurisation avec Docker
- Déploiement sur Open Liberty

---

## 🛠️ Technologies utilisées

- Java 17
- Spring Boot
- Maven
- Docker / Docker Compose
- Jenkins
- Open Liberty

---

## ⚙️ Déploiement local

### 1. Cloner le dépôt
```bash
git clone https://github.com/Najibe-hash/Spring
cd Spring/
```

### 2. Lancer les conteneurs
```bash
docker compose up -d
```

### 3. Accéder à l’application

- Jenkins : [http://localhost:8080](http://localhost:8080)
- Open Liberty (API) : [http://localhost:9080/api/hello](http://localhost:9080/api/hello)

---

## 🔄 Pipeline Jenkins

La pipeline effectue les étapes suivantes :

1. Clone du projet
2. Build avec Maven
3. Copie du fichier `.war` dans `deployments/`
4. Déploiement automatique sur Open Liberty
5. Test automatique de l'API `/api/hello`

---

## 📁 Structure du projet

```
.
├── demo/                      # Application Spring Boot
│   └── ...
├── Jenkinsfile               # Définition de la pipeline CI/CD
├── docker-compose.yml        # Services Jenkins et Open Liberty
├── deployments/              # Répertoire partagé pour le déploiement du .war
└── README.md                 # Ce fichier
```

---

## 📫 Auteur

Projet développé par Visticot Najibe.
