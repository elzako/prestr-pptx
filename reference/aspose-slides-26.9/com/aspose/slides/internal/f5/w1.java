package com.aspose.slides.internal.f5;

import com.aspose.slides.Collections.Generic.List;

public class w1 {
   private List<w1$n5> n5;

   private List<w1$n5> l6() {
      if (this.n5 == null) {
         this.n5 = new List<>();
      }

      return this.n5;
   }

   private int l6(String var1, String var2) {
      return this.l6().findIndex(new w1$1(this, var2, var1));
   }

   private int l6(String var1) {
      return this.l6().findIndex(new w1$2(this, var1));
   }

   public final String n5(int var1) {
      return this.l6().get_Item(var1).l6();
   }

   public final String l6(int var1) {
      return this.l6().get_Item(var1).n5();
   }

   public final int n5() {
      return this.l6().size();
   }

   public final boolean n5(String var1) {
      return this.l6(var1) != -1;
   }

   public final boolean n5(String var1, String var2) {
      return this.l6(var1, var2) != -1;
   }
}
