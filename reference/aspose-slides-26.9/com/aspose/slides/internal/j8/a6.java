package com.aspose.slides.internal.j8;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.d1;

public class a6 extends n5 {
   private String n5;
   private String l6;
   private boolean k5;

   public a6(String var1, boolean var2) {
      if (var1 == null) {
         throw new NullReferenceException("uri must not be null");
      }

      this.l6 = var1;
      this.k5 = var2;
   }

   public final String u3() {
      return this.n5;
   }

   public final String a6() {
      return this.l6;
   }

   public final boolean u9() {
      return this.k5;
   }

   @Override
   public boolean n5(n5 var1) {
      if (var1 == null) {
         throw new NullReferenceException("other must not be null");
      } else if (!com.aspose.slides.internal.v6g.k5.l6(var1, a6.class)) {
         return false;
      } else {
         a6 var2 = (a6)var1;
         if (!d1.a6(this.u3(), var2.u3())) {
            return false;
         } else {
            return !d1.a6(this.a6(), var2.a6()) ? false : this.u9() == var2.u9();
         }
      }
   }

   @Override
   public String k5() {
      return d1.n5(new String[]{"aps-", com.aspose.slides.internal.j8.k5.u9.n5()});
   }
}
