package edu.farmingdale.pizzapartybottomnavbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlin.math.ceil

@Composable
fun SideBar(){
  Column( modifier = Modifier.fillMaxSize().padding(16.dp),
      verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
  ){
      Row( modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)

      ) {
          PizzaPartyScreen()
      }
      Row( modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)

      ) {
          GpaAppScreen()
      }
      Row( modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)

      ) {
          Screen3()
      }
  }
}