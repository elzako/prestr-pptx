package com.aspose.slides.internal.n6d;

import com.aspose.slides.exceptions.SystemException;
import com.aspose.slides.ms.System.j3;

@j3
public class n5 extends SystemException {
   private int n5;

   public n5() {
      super("SocketException");
   }

   public n5(int var1) {
      super("SocketException ErrorCode: " + var1);
      this.n5 = var1;
   }
}
