package com.aspose.slides.Collections.Generic;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.exceptions.NotSupportedException;

public class SortedList$ThrowHelper {
   public static void throwKeyNotFoundException() {
      throw new KeyNotFoundException();
   }

   public static void throwArgumentException(String message) {
      throw new ArgumentException(message);
   }

   public static void throwArgumentNullException(String param) {
      throw new ArgumentNullException(param);
   }

   public static void throwArgumentOutOfRangeException(String param, String msg) {
      throw new ArgumentOutOfRangeException(param, msg);
   }

   public static void throwInvalidOperationException(String messgage) {
      throw new InvalidOperationException(messgage);
   }

   public static void throwNotSupportedException(String message) {
      throw new NotSupportedException(message);
   }
}
