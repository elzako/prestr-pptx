package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class h7e extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "par", "seq", "excl", "anim", "animClr", "animEffect", "animMotion", "animRot", "animScale", "cmd", "set", "audio", "video"
   );

   public h7e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new h7e$1(this, var1));
   }

   public h7e() {
      this.k5();
   }

   private void k5() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (l6.n5(var5.n5())) {
               case 0:
                  ((o2n)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 1:
                  ((q3a)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 2:
                  ((g8z)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 3:
                  ((a4w)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 4:
                  ((s5v)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 5:
                  ((n3m)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 6:
                  ((h7g)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 7:
                  ((c3t)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 8:
                  ((q6i)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 9:
                  ((s1z)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 10:
                  ((p2j)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 11:
                  ((e3b)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 12:
                  ((u3l)var5.k5()).n5("p", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (l6.n5(var1)) {
         case 0:
            var2 = new g7("par", new o2n());
            break;
         case 1:
            var2 = new g7("seq", new q3a());
            break;
         case 2:
            var2 = new g7("excl", new g8z());
            break;
         case 3:
            var2 = new g7("anim", new a4w());
            break;
         case 4:
            var2 = new g7("animClr", new s5v());
            break;
         case 5:
            var2 = new g7("animEffect", new n3m());
            break;
         case 6:
            var2 = new g7("animMotion", new h7g());
            break;
         case 7:
            var2 = new g7("animRot", new c3t());
            break;
         case 8:
            var2 = new g7("animScale", new q6i());
            break;
         case 9:
            var2 = new g7("cmd", new s1z());
            break;
         case 10:
            var2 = new g7("set", new p2j());
            break;
         case 11:
            var2 = new g7("audio", new e3b());
            break;
         case 12:
            var2 = new g7("video", new u3l());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.n5.addItem(var2);
      return var2;
   }

   public final void n5(g7 var1) {
      this.n5.addItem(var1);
   }

   public final List<g7> n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(h7e var0) {
      return var0.n5;
   }
}
