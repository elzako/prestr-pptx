package com.aspose.slides.internal.r7c;

import com.aspose.slides.Collections.Generic.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class u3 extends l6 {
   private Matcher u3;
   private boolean a6;
   private k5 u9;

   u3(Pattern var1, String var2) {
      super(var2, var1.pattern(), false);
      this.u3 = var1.matcher(var2);
      this.a6 = this.u3.find();
   }

   u3(Pattern var1, String var2, int var3) {
      super(var2, var1.pattern(), false);
      this.u3 = var1.matcher(var2);
      this.a6 = this.u3.find(var3);
   }

   private u3(Matcher var1) {
      super(var1.group(), false);
      this.u3 = var1;
      this.a6 = this.u3.find();
   }

   public k5 a6() {
      if (this.u9 == null) {
         List var1 = this.h0();
         this.u9 = new k5(this, var1);
      }

      return this.u9;
   }

   private List<String> h0() {
      String var1 = this.n5;
      List var2 = new List();
      int var3 = 0;
      List var4 = new List();
      u3$n5 var5 = new u3$n5(this, null);
      int var6 = 0;

      for (int var7 = 0; var7 < var1.length(); var7++) {
         if (var1.charAt(var7) == '[' && !this.n5(var1, var7)) {
            var6++;
         } else if (var1.charAt(var7) == ']' && !this.n5(var1, var7)) {
            var6--;
         } else if (var6 <= 0) {
            if (var1.charAt(var7) == '(') {
               var3++;
               if (var3 <= 1
                  && (var7 <= 0 || var1.charAt(var7 - 1) != '\\')
                  && var1.charAt(var7 + 1) != '?'
                  && (var7 <= 0 || var1.charAt(var7 - 1) != '\\' || var7 <= 1 || var1.charAt(var7 - 2) == '\\')) {
                  u3$n5.n5(var5, var7 + 1);
               }
            } else if (var1.charAt(var7) == ')') {
               var3--;
               if (var3 <= 0 && (var1.charAt(var7 - 1) != '\\' || var1.charAt(var7 - 2) == '\\') && u3$n5.n5(var5) >= 0) {
                  u3$n5.l6(var5, var7);
                  var4.add(var5);
                  var5 = new u3$n5(this, null);
               }
            }
         }
      }

      var2.addItem(var1);

      for (Object recoveredElement$var8$2109 : var4) {
         u3$n5 var8 = (u3$n5)recoveredElement$var8$2109;
         var2.add(var1.substring(u3$n5.n5(var8), u3$n5.l6(var8)));
      }

      return var2;
   }

   private boolean n5(String var1, int var2) {
      boolean var3 = false;

      while (true) {
         var2--;
         if (var2 < 0 || var1.charAt(var2) != '\\') {
            return var3;
         }

         var3 = !var3;
      }
   }

   @Override
   public boolean u3() {
      return this.a6;
   }

   @Override
   public int n5() {
      return this.u3.start();
   }

   @Override
   public int l6() {
      return this.u3.end() - this.u3.start();
   }

   @Override
   public String k5() {
      return this.u3.group();
   }

   @Override
   public String toString() {
      return this.k5();
   }

   public u3 u9() {
      return new u3(this.u3);
   }

   public static Matcher n5(u3 var0) {
      return var0 == null ? null : var0.u3;
   }
}
