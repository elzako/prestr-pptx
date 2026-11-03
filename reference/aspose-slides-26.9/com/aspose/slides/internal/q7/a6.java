package com.aspose.slides.internal.q7;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;

public class a6 implements s7 {
   private final String n5;
   private final String l6;
   private final String k5 = o0.l6().n5("N");

   public a6() {
      this.n5 = z1.n5();
      this.l6 = z1.l6(this.l6(), this.n5(this.k5));
   }

   public a6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("rootPath");
      }

      if (!com.aspose.slides.internal.z0k.u3.k5(var1)) {
         throw new ArgumentException(d1.n5("Directory \"{0}\" does not exist", new Object[]{var1}), "rootPath");
      }

      this.n5 = var1;
      this.l6 = z1.l6(this.l6(), this.n5(this.k5));
   }

   @Override
   public final String n5() {
      return this.l6;
   }

   @Override
   public final String l6() {
      return this.n5;
   }

   @Override
   public final String k5() {
      return "slides_";
   }

   private String n5(String var1) {
      return d1.n5(d1.n5(new String[]{"slides_", "{0}"}), new Object[]{var1});
   }
}
