import React from 'react';
import { Alert, StyleSheet, Text, View } from 'react-native';
import { Notifications, Permissions } from 'expo';


//取得のためのコード
async function registerForPushNotificationsAsync() {

  //warningがでるのを防ぐためにtry catchを入れる
  try {

    let token = await Notifications.getExpoPushTokenAsync();

    //コンソールに出力
    console.log(token);
    Alert.alert(
       token
    )

  } catch (error) {
    console.log(error);
  }
}


export default class App extends React.Component {
  componentDidMount() {
    //呼び出し
    registerForPushNotificationsAsync();
  }
  render() {
    return (
      <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
        <Text>Open up App.js to start working on your app!</Text>
      </View>
    );
  }
}