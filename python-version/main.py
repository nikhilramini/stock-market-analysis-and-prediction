from sentiment_analysis import analyze_sentiment
from stock_prediction import predict_trend

def main():
    news_text = """
    Stock markets showed positive growth today after strong global cues
    and increased investor confidence.
    """

    sentiment_score = analyze_sentiment(news_text)
    trend = predict_trend(sentiment_score)

    print("Sentiment Score:", sentiment_score)
    print("Predicted Stock Market Trend:", trend)

if __name__ == "__main__":
    main()
