package org.scalaide.worksheet.lexical

import scala.tools.eclipse.properties.syntaxcolouring.ScalaSyntaxClass

import org.eclipse.jface.preference.IPreferenceStore

object SyntaxClasses {
  val EVAL_RESULT_FIRST_LINE = ScalaSyntaxClass("Evaluation result - First line", "syntaxColouring.evalResultFirstLine")
  val EVAL_RESULT_NEW_LINE = ScalaSyntaxClass("Evaluation result - New line", "syntaxColouring.evalResultNewLine")
  val EVAL_RESULT_MARKER = ScalaSyntaxClass("Evaluation result - Marker", "syntaxColouring.evalResultMarker")
  val EVAL_RESULT_DELIMITER = ScalaSyntaxClass("Evaluation result - Delimiter", "syntaxColouring.evalResultDelimiter")

  val ALL_SYNTAX_CLASSES = Array(EVAL_RESULT_FIRST_LINE, EVAL_RESULT_NEW_LINE, EVAL_RESULT_MARKER, EVAL_RESULT_DELIMITER)
}