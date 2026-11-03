package com.aspose.slides.internal.q6f;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.j0e.n5$l6;
import com.aspose.slides.internal.j0e.n5$n5;
import com.aspose.slides.internal.z0k.w1;

class n5 extends com.aspose.slides.internal.j0e.n5 implements n5$l6 {
   private List<String> n5 = new List<>();
   private String l6 = null;
   private String k5 = null;
   private boolean u3 = false;
   private boolean a6 = false;
   private boolean u9 = false;

   n5(String var1) {
      this.l6 = var1;
   }

   public void u3(String var1) {
      this.n5.clear();
      this.n5(new w1(var1), this);
   }

   public String u3() {
      return this.k5;
   }

   private void a6(String var1) {
      if (this.k5 == null) {
         this.k5 = var1;
      }
   }

   private boolean u9(String var1) {
      return var1.equals(this.toString());
   }

   private boolean a6() {
      return this.u9("/fontconfig/alias/family");
   }

   private boolean u9() {
      return this.u9("/fontconfig/alias/prefer/family");
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();

      for (String var3 : this.n5) {
         var1.append("/").append(var3);
      }

      return var1.toString();
   }

   @Override
   public void n5(com.aspose.slides.internal.j0e.n5 var1) {
   }

   @Override
   public void l6(com.aspose.slides.internal.j0e.n5 var1) {
   }

   @Override
   public void n5(String var1, n5$n5 var2) {
      this.n5.add(var1.toLowerCase());
   }

   @Override
   public void n5(String var1) {
      this.n5.removeAt(this.n5.size() - 1);
   }

   @Override
   public void n5(String var1, String var2) {
   }

   @Override
   public void l6(String var1) {
      if (this.a6() && var1.toLowerCase().equals(this.l6)) {
         this.u3 = true;
      } else if (this.u9() && this.u3) {
         this.a6(var1);
      }
   }

   @Override
   public void k5(String var1) {
   }
}
