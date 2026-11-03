package com.aspose.slides.internal.f5;

import com.aspose.slides.ms.System.d1;

public class e2 implements com.aspose.slides.internal.j3.e2 {
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   public z1 n5;

   public e2(String var1, String var2, String var3, z1 var4) {
      this.a6 = var1;
      this.l6 = var2;
      this.u3 = var3;
      this.n5 = var4;
   }

   @Override
   public final String n5() {
      return this.l6;
   }

   public final String l6() {
      if (this.k5 == null) {
         if (this.a6.length() > 0) {
            if (this.l6.length() > 0) {
               String var1 = d1.n5(new String[]{this.a6, ":", this.l6});
               synchronized (this.n5.k5()) {
                  if (this.k5 == null) {
                     this.k5 = this.n5.k5().n5(var1);
                  }

                  return this.k5;
               }
            }

            this.k5 = this.a6;
         } else {
            this.k5 = this.l6;
         }
      }

      return this.k5;
   }

   public final String k5() {
      if (this.u3 == null) {
         this.u3 = this.u3().q0(this.a6());
      }

      return this.u3;
   }

   public final z1 u3() {
      return this.n5;
   }

   public final String a6() {
      return this.a6;
   }

   public final void n5(String var1) {
      this.a6 = var1;
   }

   public final boolean u9() {
      if (d1.n5(this.a6())) {
         return true;
      }

      if (!d1.n5(this.u3().u3().n5(this.a6())) && (this.n5.u9().l6("xhtml", d1.n5) || this.n5.t4(this.k5()))) {
         return true;
      }

      this.k5 = this.l6 = d1.n5("{0}:{1}",new Object[]{ this.a6, this.l6});
      this.a6 = d1.n5;
      this.u3 = null;
      return false;
   }
}
