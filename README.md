# stock-market-analysis-and-prediction
Stock Market Analysis and Prediction using News Sentiment Analysis and Machine Learning

# 📈 Stock Market Analysis and Prediction

This project predicts stock market trends by analyzing financial news
using Natural Language Processing (NLP) and sentiment analysis techniques.

The repository is designed so that **anyone can understand the project from scratch**.
It contains both:
- A **modern Python implementation** (clean, simple, and GitHub-friendly)
- The **original Java / JSP academic project** (complete college submission)

## 🧠 Problem Statement

Stock markets are highly influenced by news related to the economy,
politics, and global events. Manually analyzing such news is difficult
and time-consuming.

This project automates the process by:
- Extracting sentiment from financial news
- Calculating polarity scores
- Predicting stock market trends (UP / DOWN / NEUTRAL)

## 🏗️ Conceptual Architecture

```
Financial News
↓
Text Preprocessing
↓
Sentiment Analysis (NLP)
↓
Polarity Score
↓
Stock Trend Prediction
```

## 📂 Repository Structure

```
stock-market-analysis-and-prediction/
│
├── README.md                    ← MAIN explanation (MOST IMPORTANT)
│
├── python-version/              ← Modern, easy-to-understand implementation
│   ├── README.md
│   ├── main.py
│   ├── sentiment_analysis.py
│   ├── stock_prediction.py
│   └── requirements.txt
│
├── java-version/                ← Original academic project (full)
│   ├── README.md
│   ├── build.xml
│   ├── nbproject/
│   ├── src/
│   ├── web/
│   ├── WEB-INF/
│   └── lib/
│
├── docs/
│   └── Stock_Market_Analysis_and_Prediction.pdf
│
└── .gitignore
```

## Features
- User Registration and Authentication
- Real-time Stock Market Data Analysis
- Financial News Sentiment Analysis
- Stock Price Prediction
- Company and Article Management
- Stock Trading Simulation

## Technologies Used
- **Backend**: Java Servlets, JSP
- **Frontend**: HTML, CSS, JavaScript, JSP
- **Database**: MySQL
- **NLP Tools**: Stanford POS Tagger, SentiWordNet
- **Server**: Apache Tomcat
- **Build Tool**: Apache Ant

## Database Schema
The system uses the following main tables:
- `userreg` - User registration information
- `comregister` - Company registration
- `articlereg` - Article publishers
- `publish` - Published articles with sentiment analysis
- `comment` - User comments and opinions
- `purchaseshare` - Stock purchase records

## Installation

### Prerequisites
1. Java Development Kit (JDK) 8 or higher
2. Apache Tomcat 9.x
3. MySQL Server 5.7 or higher
4. Apache Ant

### Setup Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/nikhilramini/stock-market-analysis-and-prediction.git
   cd stock-market-analysis-and-prediction
   ```
2. **Database Setup**
   ```bash
   CREATE DATABASE stock_prediction;
   USE stock_prediction;
   -- Run the SQL scripts from the documentation
   ```
3. **Configure Database Connection**
   Update the database connection parameters in the source code.

4. **Build the Project**
   ```bash
   ant compile
   ant dist
   ```
5. **Deploy to Tomcat**
   ```bash
   Copy the generated WAR file to Tomcat's webapps/ directory
   Start Tomcat server
   ```
6. **Access the Application**
   Open browser and navigate to:
   ```bash
   http://localhost:8080/Stock_Market_Prediction/
   ```




