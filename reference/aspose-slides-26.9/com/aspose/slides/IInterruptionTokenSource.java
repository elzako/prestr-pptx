package com.aspose.slides;

public interface IInterruptionTokenSource {
   IInterruptionToken getToken();

   boolean isInterruptionRequested();

   void interrupt();
}
