package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;

public class z1 {
   private int a6;
   private boolean u9;
   private boolean h0;
   public static final z1 n5 = new z1(1);
   public static final z1 l6 = new z1(0, false, false);
   public static final z1 k5 = new z1(3);
   public static final z1 u3 = new z1(3, true, true);

   public z1(int var1) {
      this.a6 = var1;
      this.h0 = true;
   }

   protected z1(int var1, boolean var2, boolean var3) {
      this.a6 = var1;
      this.u9 = var2;
      this.h0 = var3;
   }

   public final int l6() {
      return this.a6;
   }

   public final boolean k5() {
      return this.a6 == 0 || this.a6 == 3;
   }

   public boolean n5() {
      return this.h0;
   }

   public final boolean u3() {
      return this.a6 != 0 && this.a6 != 1 ? this.u9 : false;
   }

   public final void n5(boolean var1) {
      this.u9 = var1;
   }

   public void n5(x5 var1) {
   }

   public Object n5(com.aspose.slides.ms.System.Xml.k6 var1, x5 var2, int[] var3) {
      if (this.a6 == 0 || this.a6 == 1) {
         var2.k5 = false;
      }

      var3[0] = -1;
      return null;
   }

   public boolean l6(x5 var1) {
      return true;
   }

   public ArrayList n5(x5 var1, boolean var2) {
      return null;
   }

   public ArrayList n5(x5 var1, boolean var2, k0t var3) {
      return null;
   }

   public static void n5(c1 var0, k0t var1, ArrayList var2) {
      n5(var0, var1, var2, false);
   }

   public static void n5(c1 var0, k0t var1, ArrayList var2, boolean var3) {
      if (!var2.contains(var0)) {
         var2.addItem(var0);
      }

      v1 var4 = com.aspose.slides.internal.v6g.k5.n5(var0, v1.class);
      if (var4 != null && (var3 || !var4.q0().k5())) {
         d0 var5 = var1.c8();
         f8y var6 = (f8y)var5.k5(var4.z8());
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.n5().size(); var7++) {
               v1 var8 = (v1)var6.n5().get_Item(var7);
               if (!var4.z8().equals(var8.z8()) && !var2.contains(var8)) {
                  var2.addItem(var8);
               }
            }
         }
      }
   }
}
