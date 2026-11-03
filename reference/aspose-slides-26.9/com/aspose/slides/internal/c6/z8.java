package com.aspose.slides.internal.c6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.y8;

public class z8 {
   private String n5;
   private List<String> l6;
   private List<String> k5;
   private List<m3> u3;
   private long a6;

   public z8() {
      this.n5(d1.n5);
      this.n5(new List<>());
      this.l6(new List<>());
      this.k5(new List<>());
   }

   public String n5() {
      return this.n5;
   }

   public void n5(String var1) {
      this.n5 = var1;
   }

   public List<String> l6() {
      return this.l6;
   }

   public void n5(List<String> var1) {
      this.l6 = var1;
   }

   public List<String> k5() {
      return this.k5;
   }

   public void l6(List<String> var1) {
      this.k5 = var1;
   }

   public List<m3> u3() {
      return this.u3;
   }

   public void k5(List<m3> var1) {
      this.u3 = var1;
   }

   public long a6() {
      return this.a6;
   }

   public void n5(long var1) {
      this.a6 = var1;
   }

   public static z8 n5(com.aspose.slides.internal.y7.k5 var0) {
      z8 var1 = new z8();
      var1.n5 = var0.n5("title", "");
      String var2 = var0.n5("type", "");
      String[] var3 = j5.getNames(y8.k5(j5.class.getTypeName()));
      int var4 = 0;

      for (int var5 = 0; var5 < var3.length; var5++) {
         if (var3[var5].toLowerCase().equals(var2)) {
            var4 = var5;
            break;
         }
      }

      var1.a6 = var4;
      if (var0.u9("paragraphs")) {
         for (Object var7 : var0.n5("paragraphs")) {
            if (var7 instanceof String) {
               var1.l6.add((String)var7);
            }
         }
      }

      if (var0.u9("columnHeaders")) {
         for (Object var13 : var0.n5("columnHeaders")) {
            if (var13 instanceof String) {
               var1.k5.add((String)var13);
            }
         }
      }

      if (var0.u9("rows")) {
         for (Object var14 : var0.n5("rows")) {
            if (var14 instanceof com.aspose.slides.internal.y7.k5) {
               var1.u3.add(m3.n5((com.aspose.slides.internal.y7.k5)var14));
            }
         }
      }

      return var1;
   }
}
