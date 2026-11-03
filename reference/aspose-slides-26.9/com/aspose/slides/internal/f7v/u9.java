package com.aspose.slides.internal.f7v;

import java.util.ArrayList;
import java.util.List;

public class u9 {
   protected List<s7> n5 = new ArrayList<>();
   final com.aspose.slides.internal.c5e.l6 l6;

   public u9(com.aspose.slides.internal.c5e.l6 var1) {
      this.l6 = var1;
   }

   protected static List<s7> n5(List<s7> var0, String var1, String var2) {
      return var2 == null ? com.aspose.slides.internal.f7v.n5.n5(var0, new h0(var1)) : com.aspose.slides.internal.f7v.n5.n5(var0, new c8(var1, var2));
   }

   public void n5(s7 var1, int var2) {
      var1.n5(var2);
      this.n5.add(var1);
   }

   public List<? extends s7> n5(String var1) {
      return this.n5(var1, null);
   }

   public List<? extends s7> n5(String var1, String var2) {
      return n5(this.n5, var1, var2);
   }

   public s7 l6(String var1) {
      return this.n5(var1, false);
   }

   public s7 n5(String var1, boolean var2) {
      return this.n5(var1, null, var2);
   }

   public s7 n5(String var1, String var2, boolean var3) {
      List var4 = this.n5(var1, var2);
      if (var4.isEmpty()) {
         return null;
      } else if (var4.size() <= 1 || !var3 && ((s7)var4.get(0)).n5()) {
         return (s7)var4.get(var4.size() - 1);
      } else {
         throw new com.aspose.slides.internal.c5e.e2("unexpected multiple chunks id=" + var1);
      }
   }

   @Override
   public String toString() {
      return "ChunkList: read: " + this.n5.size();
   }
}
