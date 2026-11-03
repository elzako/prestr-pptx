package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public abstract class y4 {
   private static com.aspose.slides.ms.System.j5 u3 = new com.aspose.slides.ms.System.j5(1601, 1, 1);
   protected String n5;
   protected String l6;
   boolean k5 = false;

   public abstract String l6();

   public String u9() {
      return this.n5;
   }

   public String h0() {
      return z1.a6(this.l6());
   }

   protected y4() {
      this.n5 = null;
   }

   protected void k5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("path");
      }

      if (d1.l6(var1).length() == 0) {
         throw new ArgumentException("An empty file name is not valid.");
      }
   }
}
