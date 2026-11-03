package com.aspose.slides.internal.v7y;

import com.aspose.slides.Collections.ArrayList;

public class k5 extends c4 {
   private int l6;
   private ArrayList k5;
   private String u3 = null;
   private String a6 = null;
   public static int[] n5 = new int[]{0, 0, 0, 3, 1, 1, 1, 1, 2, 0, 2, 2, 2, 1, 2, 2, 1, 1, 1, 0, 1, 1, 2, 0, 0, 0, 0, 5};

   public k5(int var1, ArrayList var2) {
      this.l6 = var1;
      this.k5 = new ArrayList(var2);
   }

   public k5(String var1, String var2, ArrayList var3) {
      this.l6 = 27;
      this.a6 = var1;
      this.u3 = var2;
      this.k5 = new ArrayList(var3);
   }

   public k5(int var1, c4 var2) {
      this.l6 = var1;
      this.k5 = new ArrayList();
      this.k5.addItem(var2);
   }

   @Override
   public int ad_() {
      return 4;
   }

   @Override
   public int l6() {
      return n5[this.l6];
   }

   public final int k5() {
      return this.l6;
   }

   public final ArrayList u3() {
      return this.k5;
   }

   public final String a6() {
      return this.a6;
   }

   public final String u9() {
      return this.u3;
   }
}
