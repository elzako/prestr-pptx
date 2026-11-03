package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

public class k8 implements v4 {
   private com.aspose.slides.ms.System.r8 n5;
   private boolean l6;
   private ArrayList k5;
   private f2 u3;

   public k8() {
      this((com.aspose.slides.ms.System.r8)null, false, null, null);
   }

   public k8(com.aspose.slides.ms.System.r8 var1) {
      this(var1, false, null, null);
   }

   public k8(String var1, int var2) {
      this(new com.aspose.slides.ms.System.r8("http://" + var1 + ":" + var2));
   }

   public k8(com.aspose.slides.ms.System.r8 var1, boolean var2, String[] var3, f2 var4) {
      this.n5 = var1;
      this.l6 = var2;
      if (var3 != null) {
         ArrayList var5 = new ArrayList(var3.length);

         for (int var6 = 0; var6 < var3.length; var6++) {
            var5.set_Item(var6, var3[var6]);
         }

         this.k5 = var5;
      }

      this.u3 = var4;
      this.l6();
   }

   @Override
   public f2 n5() {
      return this.u3;
   }

   @Override
   public com.aspose.slides.ms.System.r8 n5(com.aspose.slides.ms.System.r8 var1) {
      return this.l6(var1) ? var1 : this.n5;
   }

   @Override
   public boolean l6(com.aspose.slides.ms.System.r8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("host");
      }

      if (var1.t2() && this.l6) {
         return true;
      }

      if (this.n5 == null) {
         return true;
      }

      String var2 = var1.a6();
      if (this.l6 && var2.indexOf(46) == -1) {
         return true;
      }

      if (!this.l6) {
         if (com.aspose.slides.ms.System.d1.n5(var2, "localhost", true, com.aspose.slides.internal.x7n.l6.k5()) == 0) {
            return true;
         }

         if (com.aspose.slides.ms.System.d1.n5(var2, "loopback", true, com.aspose.slides.internal.x7n.l6.k5()) == 0) {
            return true;
         }

         i1[] var3 = new i1[]{null};
         if (i1.n5(var2, var3) && i1.n5(var3[0])) {
            return true;
         }
      }

      if (this.k5 != null && this.k5.size() != 0) {
         try {
            String var7 = var1.t9() + "://" + var1.k5();

            int var4;
            for (var4 = 0; var4 < this.k5.size(); var4++) {
               com.aspose.slides.internal.r7c.c8 var5 = new com.aspose.slides.internal.r7c.c8((String)this.k5.get_Item(var4), 66);
               if (var5.u3(var7)) {
                  break;
               }
            }

            if (var4 == this.k5.size()) {
               return false;
            }

            while (var4 < this.k5.size()) {
               new com.aspose.slides.internal.r7c.c8((String)this.k5.get_Item(var4));
               var4++;
            }

            return true;
         } catch (ArgumentException var6) {
            return false;
         }
      } else {
         return false;
      }
   }

   void l6() {
      if (this.k5 != null) {
         for (int var1 = 0; var1 < this.k5.size(); var1++) {
            new com.aspose.slides.internal.r7c.c8((String)this.k5.get_Item(var1));
         }
      }
   }
}
