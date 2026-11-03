package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k4y.g7$n5;
import com.aspose.slides.ms.System.IDisposable;

class l8c {
   public static void n5(IMotionEffect var0, com.aspose.slides.internal.k4y.h7g var1) {
      var0.setOrigin(var1.a6());
      var0.setPathEditMode(var1.h0());
      var0.setAngle(var1.c8());
      var0.setPath(n5(var0, var1.u9(), var1.t2()));
      if (var1.n3() != null) {
         ((MotionEffect)var0).n5(new com.aspose.slides.internal.o9b.w1(var1.n3().n5(), var1.n3().l6()));
      }

      if (var1.y4() != null) {
         ((MotionEffect)var0).l6(new com.aspose.slides.internal.o9b.w1(var1.y4().n5(), var1.y4().l6()));
      }

      if (var1.x8() != null) {
         ((MotionEffect)var0).k5(new com.aspose.slides.internal.o9b.w1(var1.x8().n5(), var1.x8().l6()));
      }

      if (var1.e2() != null) {
         ((MotionEffect)var0).u3(new com.aspose.slides.internal.o9b.w1(var1.e2().n5(), var1.e2().l6()));
      }
   }

   public static void n5(IMotionEffect var0, g7$n5 var1, com.aspose.slides.internal.k4y.u2q[] var2) {
      com.aspose.slides.internal.k4y.h7g var3 = (com.aspose.slides.internal.k4y.h7g)var1.n5("animMotion").l6();
      var2[0] = var3.s7();
      var3.n5((byte)var0.getOrigin());
      var3.l6((byte)var0.getPathEditMode());
      var3.n5(var0.getAngle());
      var3.n5(n5(var0.getPath()));
      var3.l6(l6(var0.getPath()));
      if (!com.aspose.slides.ms.System.n1.k5(((MotionEffect)var0).l6().l6()) && !com.aspose.slides.ms.System.n1.k5(((MotionEffect)var0).l6().k5())) {
         o5.n5(var3.l6(), ((MotionEffect)var0).l6().u3());
      }

      if (!com.aspose.slides.ms.System.n1.k5(((MotionEffect)var0).k5().l6()) && !com.aspose.slides.ms.System.n1.k5(((MotionEffect)var0).k5().k5())) {
         o5.n5(var3.k5(), ((MotionEffect)var0).k5().u3());
      }

      if (!com.aspose.slides.ms.System.n1.k5(((MotionEffect)var0).u3().l6()) && !com.aspose.slides.ms.System.n1.k5(((MotionEffect)var0).u3().k5())) {
         o5.n5(var3.n5(), ((MotionEffect)var0).u3().u3());
      }

      if (!com.aspose.slides.ms.System.n1.k5(((MotionEffect)var0).a6().l6()) && !com.aspose.slides.ms.System.n1.k5(((MotionEffect)var0).a6().k5())) {
         o5.n5(var3.u3(), ((MotionEffect)var0).a6().u3());
      }
   }

   static IMotionPath n5(IMotionEffect var0, String var1, String var2) {
      MotionPath var3 = new MotionPath();
      int var4 = 0;
      String var5 = var1 == null ? "" : com.aspose.slides.ms.System.d1.l6(var1);
      int var6 = var5.length();
      int var7 = 0;
      int var8 = 0;

      while (var4 != var6) {
         boolean var9 = false;
         byte var10 = 0;
         switch (var5.charAt(var4)) {
            case 'C':
               var10 = 2;
               var7++;
               break;
            case 'E':
            case 'e':
               var10 = 4;
               break;
            case 'L':
               var10 = 1;
               var7++;
               break;
            case 'M':
               var10 = 0;
               var7++;
               break;
            case 'Z':
            case 'z':
               var10 = 3;
               break;
            case 'c':
               var9 = true;
               var10 = 2;
               var7++;
               break;
            case 'l':
               var9 = true;
               var10 = 1;
               var7++;
               break;
            case 'm':
               var9 = true;
               var10 = 0;
               var7++;
               break;
            default:
               throw new PptxException("Unknow command.");
         }

         byte var11 = 0;
         if (var2 != null && var2.length() > 0 && var7 != var8 && var7 <= var2.length()) {
            var8 = var7;
            switch (var2.charAt(var8 - 1)) {
               case 'A':
                  var11 = 1;
                  break;
               case 'F':
                  var11 = 2;
                  break;
               case 'S':
                  var11 = 4;
                  break;
               case 'T':
                  var11 = 3;
                  break;
               case 'a':
                  var11 = 5;
                  break;
               case 'f':
                  var11 = 6;
                  break;
               case 's':
                  var11 = 8;
                  break;
               case 't':
                  var11 = 7;
                  break;
               default:
                  throw new PptxException("Unknow command.");
            }
         }

         int[] var12 = new int[]{var4};
         var3.n5(var10, n5(var5, var12), var11, var9);
         var4 = var12[0];
      }

      return var3;
   }

   private static com.aspose.slides.internal.o9b.w1[] n5(String var0, int[] var1) {
      if (var0.charAt(var1[0]) != 'Z' && var0.charAt(var1[0]) != 'z' && var0.charAt(var1[0]) != 'E' && var0.charAt(var1[0]) != 'e') {
         List var2 = new List();

         while (!com.aspose.slides.ms.System.t9.u3(var0.charAt(var1[0])) && var0.charAt(var1[0]) != '-') {
            if (var1[0] + 1 >= var0.length()) {
               throw new PptxException("broken path.");
            }

            var1[0]++;
         }

         while (var1[0] + 1 < var0.length() && !com.aspose.slides.ms.System.t9.u9(var0.charAt(var1[0]))) {
            String var3 = l6(var0, var1);
            var1[0]++;
            String var4 = l6(var0, var1);
            float var5 = 0.0F;
            float var6 = 0.0F;
            float[] var7 = new float[]{0.0F};
            float[] var8 = new float[]{0.0F};
            boolean var9 = com.aspose.slides.ms.System.n1.n5(var3, 511, com.aspose.slides.internal.x7n.l6.k5(), var7)
               && com.aspose.slides.ms.System.n1.n5(var4, 511, com.aspose.slides.internal.x7n.l6.k5(), var8);
            var5 = var7[0];
            var6 = var8[0];
            if (var9) {
               com.aspose.slides.internal.o9b.w1 var10 = new com.aspose.slides.internal.o9b.w1(var5, var6);
               var2.addItem(var10.u3());
            }

            while (var1[0] + 1 < var0.length() && var0.charAt(++var1[0]) == ' ') {
            }
         }

         return (com.aspose.slides.internal.o9b.w1[])var2.toArray(new com.aspose.slides.internal.o9b.w1[0]);
      } else {
         var1[0]++;

         while (var1[0] + 1 < var0.length() && var0.charAt(++var1[0]) == ' ') {
         }

         return null;
      }
   }

   private static String l6(String var0, int[] var1) {
      if (var1[0] == -1) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      int var2 = com.aspose.slides.ms.System.d1.l6(var0, ' ', var1[0]);
      if (var2 == -1) {
         var2 = var0.length();
      }

      String var3 = com.aspose.slides.ms.System.d1.l6(var0, var1[0], var2 - var1[0]);
      var1[0] = var2;
      return com.aspose.slides.ms.System.d1.a6(var3,new char[]{ 'E', 'e'});
   }

   static String n5(IMotionPath var0) {
      String var1 = "";
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            IMotionCmdPath var3 = (IMotionCmdPath)var2.next();
            switch (var3.getCommandType()) {
               case 0:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, (char)(var3.isRelative() ? 'm' : 'M'));
                  break;
               case 1:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, (char)(var3.isRelative() ? 'l' : 'L'));
                  break;
               case 2:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, (char)(var3.isRelative() ? 'c' : 'C'));
                  break;
               case 3:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, (char)(var3.isRelative() ? 'z' : 'Z'));
                  break;
               case 4:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, (char)(var3.isRelative() ? 'e' : 'E'));
                  break;
               default:
                  throw new PptxException("fail.");
            }

            var1 = com.aspose.slides.ms.System.d1.l6(var1, ' ');
            if (((MotionCmdPath)var3).n5() != null) {
               for (com.aspose.slides.internal.o9b.w1 var7 : ((MotionCmdPath)var3).n5()) {
                  float var8 = var7.l6();
                  float var9 = var7.k5();
                  var1 = com.aspose.slides.ms.System.d1.n5(
                     var1, com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.n1.n5(var8, com.aspose.slides.internal.x7n.l6.k5()), ' '})
                  );
                  var1 = com.aspose.slides.ms.System.d1.n5(
                     var1, com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.n1.n5(var9, com.aspose.slides.internal.x7n.l6.k5()), ' '})
                  );
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return com.aspose.slides.ms.System.d1.l6(var1);
   }

   static String l6(IMotionPath var0) {
      String var1 = "";
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            IMotionCmdPath var3 = (IMotionCmdPath)var2.next();
            switch (var3.getPointsType()) {
               case 0:
                  break;
               case 1:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, 'A');
                  break;
               case 2:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, 'F');
                  break;
               case 3:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, 'T');
                  break;
               case 4:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, 'S');
                  break;
               case 5:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, 'a');
                  break;
               case 6:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, 'f');
                  break;
               case 7:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, 't');
                  break;
               case 8:
                  var1 = com.aspose.slides.ms.System.d1.l6(var1, 's');
                  break;
               default:
                  throw new PptxException("fail.");
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return com.aspose.slides.ms.System.d1.l6(var1);
   }
}
