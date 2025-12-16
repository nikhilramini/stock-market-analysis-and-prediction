def predict_trend(score):
    if score > 0.05:
        return "UP 📈"
    elif score < -0.05:
        return "DOWN 📉"
    else:
        return "NEUTRAL ⚖️"
