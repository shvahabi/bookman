package com.github.shvahabi.bookman.helloworld

import org.scalajs.dom
import org.scalajs.dom.document

def appendPar(targetNode: dom.Node, text: String): Unit = {
  val parNode = document.createElement("p")
  parNode.textContent = text
  targetNode.appendChild(parNode)
}
