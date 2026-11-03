package com.aspose.slides.internal.v8;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class x8 extends t2 {
   private static final String[] l6 = new String[]{"visible", "hidden", "collapse"};
   private static final int[] k5 = new int[]{159, 57, 26};
   public int n5;

   public x8(int var1) {
      super(n5(var1), var1);
      this.n5 = var1;
   }

   @Override
   public int hashCode() {
      return this.toString().hashCode();
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      } else if (obj == this) {
         return true;
      } else if (com.aspose.slides.internal.v6g.k5.l6(obj, x8.class)) {
         x8 var2 = (x8)obj;
         return this.n5 == var2.n5;
      } else {
         return false;
      }
   }

   public static String n5(int var0) {
      for (int var1 = 0; var1 < k5.length; var1++) {
         if (k5[var1] == var0) {
            return l6[var1];
         }
      }

      throw new ArgumentException(d1.n5(new String[]{"Illegal visibility: ", a3.l6(var0)}));
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5('(');
      var1.n5(this.n5());
      var1.n5(')');
      return var1.toString();
   }
}
