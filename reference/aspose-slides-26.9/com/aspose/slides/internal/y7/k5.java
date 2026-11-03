package com.aspose.slides.internal.y7;

import java.util.LinkedHashMap;

public class k5 extends LinkedHashMap<String, Object> {
   public n5 n5(String var1) {
      return this.n5(var1, (n5)null);
   }

   public n5 n5(String var1, n5 var2) {
      Object var3 = this.get(var1);
      return var3 instanceof n5 ? (n5)var3 : var2;
   }

   public int l6(String var1) {
      return this.n5(var1, 0);
   }

   public int n5(String var1, int var2) {
      Object var3 = this.get(var1);
      return var3 instanceof Number ? ((Number)var3).intValue() : var2;
   }

   public long k5(String var1) {
      return this.n5(var1, 0L);
   }

   public long n5(String var1, long var2) {
      Object var4 = this.get(var1);
      return var4 instanceof Number ? ((Number)var4).longValue() : var2;
   }

   public k5 u3(String var1) {
      return this.n5(var1, (k5)null);
   }

   public k5 n5(String var1, k5 var2) {
      Object var3 = this.get(var1);
      return var3 instanceof k5 ? (k5)var3 : var2;
   }

   public String a6(String var1) {
      return this.n5(var1, (String)null);
   }

   public String n5(String var1, String var2) {
      Object var3 = this.get(var1);
      return var3 instanceof String ? (String)var3 : var2;
   }

   public boolean u9(String var1) {
      return super.containsKey(var1);
   }
}
