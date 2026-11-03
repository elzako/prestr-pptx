package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.Dictionary;

public class e2 {
   private int l6 = 0;
   String[] n5;
   private Dictionary<String, Integer> k5;
   private boolean u3 = false;

   public e2(String... var1) {
      this.n5(0, false, var1);
   }

   public e2(int var1, String... var2) {
      this.n5(var1, false, var2);
   }

   public e2(int var1, boolean var2, String... var3) {
      this.n5(var1, var2, var3);
   }

   private void n5(int var1, boolean var2, String[] var3) {
      this.l6 = var1;
      this.n5 = var3;
      this.u3 = var2;
      this.k5 = new Dictionary<>();
      if (this.u3) {
         for (int var4 = 0; var4 < var3.length; var4++) {
            this.k5.addItem(com.aspose.slides.ms.System.d1.n5(var3[var4], com.aspose.slides.internal.x7n.l6.k5()), var4 + var1);
         }
      } else {
         for (int var5 = 0; var5 < var3.length; var5++) {
            this.k5.addItem(var3[var5], var5 + var1);
         }
      }
   }

   public int n5(String var1) {
      return this.u3 ? this.k5.get_Item(com.aspose.slides.ms.System.d1.n5(var1, com.aspose.slides.internal.x7n.l6.k5())) : this.k5.get_Item(var1);
   }

   public String n5(int var1) {
      return this.n5[var1 - this.l6];
   }

   public boolean l6(String var1) {
      return this.u3 ? this.k5.containsKey(com.aspose.slides.ms.System.d1.n5(var1, com.aspose.slides.internal.x7n.l6.k5())) : this.k5.containsKey(var1);
   }
}
