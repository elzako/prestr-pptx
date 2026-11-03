package com.aspose.slides.internal.f5;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.d1;

public class p8 extends r4 {
   private String n5;
   private String l6;
   private String k5;

   public p8(String var1, String var2, String var3, z1 var4) {
      super(var4);
      this.n5(var2);
      this.u3(var3);
      this.a6(var1);
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      String var2 = var1;
      if (var2 == null) {
         var2 = d1.n5;
      }

      this.n5 = var2;
   }

   @Override
   public com.aspose.slides.internal.j3.z8 l6(boolean var1) {
      return this.y4().k5(this.k5(), this.n5(), this.l6());
   }

   @Override
   public String t2() {
      return this.h0();
   }

   @Override
   public String h0() {
      return "xml";
   }

   @Override
   public byte n3() {
      return 13;
   }

   public final String l6() {
      return this.l6;
   }

   public final void u3(String var1) {
      if (var1 == null) {
         this.l6 = d1.n5;
      } else {
         if (var1.length() != 0 && !"yes".equals(var1) && !"no".equals(var1)) {
            throw new ArgumentException();
         }

         this.l6 = var1;
      }
   }

   public final String k5() {
      return this.k5;
   }

   public final void a6(String var1) {
      this.k5 = var1;
   }
}
