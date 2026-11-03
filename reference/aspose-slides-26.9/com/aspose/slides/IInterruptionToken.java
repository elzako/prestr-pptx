package com.aspose.slides;

public interface IInterruptionToken {
   boolean isInterruptionRequested();

   void throwIfInterruptionRequested();
}
