package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;

public final class m3 extends q0 {
   private String n5;

   public m3() {
      this("?");
   }

   public m3(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("replacement");
      }

      boolean var2 = false;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         if (com.aspose.slides.ms.System.t9.u3(var1, var3)) {
            if (com.aspose.slides.ms.System.t9.k5(var1, var3)) {
               if (var2) {
                  break;
               }

               var2 = true;
            } else {
               if (!var2) {
                  var2 = true;
                  break;
               }

               var2 = false;
            }
         } else if (var2) {
            break;
         }
      }

      if (var2) {
         throw new ArgumentException(o0.n5("String contains invalid Unicode code points.", "replacement"));
      }

      this.n5 = var1;
   }

   public final String a6() {
      return this.n5;
   }

   @Override
   public z3 n5() {
      return new z8(this);
   }

   @Override
   public int l6() {
      return this.n5.length();
   }

   @Override
   public boolean equals(Object value) {
      m3 var2 = com.aspose.slides.internal.v6g.k5.n5(value, m3.class);
      return var2 != null ? d1.a6(this.n5, var2.n5) : false;
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode();
   }
}
