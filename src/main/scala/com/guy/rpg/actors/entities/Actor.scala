package com.guy.rpg.actors.entities

import com.guy.rpg.icons.entities.Icon

abstract class Actor(
  val icon: Icon,
  var x: Int,
  var y: Int) {

  def moveUp(): Unit = {
    y = y - 1
  }

  def moveDown(): Unit = {
    y = y + 1
  }

  def moveLeft(): Unit = {
    x = x - 1
  }

  def moveRight(): Unit = {
    x = x + 1
  }
}
