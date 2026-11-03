package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Generic.List;

public final class v6 extends v9 {
   private List<v6$n5[]> n5;
   private v6$n5[] l6;
   private int k5;
   private boolean u3;
   private com.aspose.slides.internal.x7i.a6 a6 = new com.aspose.slides.internal.x7i.a6();
   private String u9;

   public v6(String var1, boolean var2) {
      this.u9 = var1;
      this.u3 = var2;
   }

   public final void h0() {
      if (this.a6.l6() == 0) {
         this.l6(0);
      }
   }

   public final void n5(l1 var1) {
      if (this.a6.l6() != 0) {
         var1.l6(this.a6.k5());
      } else {
         v9 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, v9.class);

         for (int var3 = 0; var3 < this.n5.size(); var3++) {
            v6$n5[] var4 = this.n5.get_Item(var3);

            for (int var5 = 0; var5 < var4.length; var5++) {
               switch (var4[var5].n5()) {
                  case 0:
                     return;
                  case 1:
                     var1.n5(var4[var5].l6(), var4[var5].k5(), var4[var5].u3(), (String)var4[var5].a6());
                     break;
                  case 2:
                     var1.n5(var4[var5].l6(), var4[var5].k5(), var4[var5].u3());
                     break;
                  case 3:
                     var1.u3(var4[var5].l6(), var4[var5].k5(), var4[var5].u3());
                     break;
                  case 4:
                     var1.l6();
                     break;
                  case 5:
                     var1.a6(var4[var5].l6());
                     break;
                  case 6:
                     var1.u9(var4[var5].l6());
                     break;
                  case 7:
                     var1.n5(var4[var5].l6(), var4[var5].k5());
                     break;
                  case 8:
                     var1.h0(var4[var5].l6());
                     break;
                  case 9:
                     var1.l6(var4[var5].l6());
                     break;
                  case 10:
                     var1.c8(var4[var5].l6());
                     break;
                  case 11:
                     var1.k5(var4[var5].l6());
                     break;
                  case 12:
                     var1.n5(com.aspose.slides.internal.v6g.k5.u3(var4[var5].a6(), char.class));
                     break;
                  case 13:
                     char[] var6 = com.aspose.slides.internal.v6g.k5.k5(var4[var5].a6(), char[].class);
                     var1.n5(var6[0], var6[1]);
                     break;
                  case 14:
                     byte[] var8 = com.aspose.slides.internal.v6g.k5.k5(var4[var5].a6(), byte[].class);
                     var1.n5(var8, 0, var8.length);
                     break;
                  case 15:
                     byte[] var7 = com.aspose.slides.internal.v6g.k5.k5(var4[var5].a6(), byte[].class);
                     var1.l6(var7, 0, var7.length);
                     break;
                  case 16:
                     if (var2 != null) {
                        var2.n5((Integer)var4[var5].a6());
                     }
                     break;
                  case 17:
                     if (var2 != null) {
                        var2.n5(var4[var5].l6());
                     }
                     break;
                  case 18:
                     if (var2 != null) {
                        var2.n5();
                     }
                     break;
                  case 19:
                     if (var2 != null) {
                        var2.l6(var4[var5].l6(), var4[var5].k5(), var4[var5].u3());
                     } else {
                        var1.s7();
                     }
                     break;
                  case 20:
                     if (var2 != null) {
                        var2.k5(var4[var5].l6(), var4[var5].k5(), var4[var5].u3());
                     } else {
                        var1.x8();
                     }
                     break;
                  case 21:
                     if (var2 != null) {
                        var2.l6(var4[var5].l6(), var4[var5].k5());
                     } else {
                        var1.l6("xmlns", var4[var5].l6(), "http://www.w3.org/2000/xmlns/", var4[var5].k5());
                     }
                     break;
                  case 22:
                     if (var2 != null) {
                        var2.c8();
                     }
                     break;
                  case 23:
                     var1.a6();
                     break;
                  case 24:
                     var1.u9();
                     break;
                  case 25:
                     var1.dispose();
               }
            }
         }
      }
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
      this.n5(1, var1, var2, var3, var4);
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      this.n5(2, var1, var2, var3);
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      this.n5(3, var1, var2, var3);
   }

   @Override
   public void l6() {
      this.l6(4);
   }

   @Override
   public void a6(String var1) {
      this.n5(5, var1);
   }

   @Override
   public void u9(String var1) {
      this.n5(6, var1);
   }

   @Override
   public void n5(String var1, String var2) {
      this.n5(7, var1, var2);
   }

   @Override
   public void h0(String var1) {
      this.n5(8, var1);
   }

   @Override
   public void l6(String var1) {
      if (this.n5 == null) {
         this.a6.n5(var1);
      } else {
         this.n5(9, var1);
      }
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      this.l6(com.aspose.slides.ms.System.d1.n5(var1, var2, var3));
   }

   @Override
   public void a_(char[] var1, int var2, int var3) {
      this.c8(com.aspose.slides.ms.System.d1.n5(var1, var2, var3));
   }

   @Override
   public void c8(String var1) {
      this.n5(10, var1);
   }

   @Override
   public void k5(String var1) {
      this.n5(11, var1);
   }

   @Override
   public void n5(char var1) {
      this.n5(12, Character.valueOf(var1));
   }

   @Override
   public void n5(char var1, char var2) {
      char[] var3 = new char[]{var1, var2};
      this.n5(13, var3);
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) {
      this.n5(14, k5(var1, var2, var3));
   }

   @Override
   public void l6(byte[] var1, int var2, int var3) {
      this.n5(15, k5(var1, var2, var3));
   }

   @Override
   public void a6() {
      this.l6(23);
   }

   @Override
   public void u9() {
      this.l6(24);
   }

   @Override
   public void t2(String var1) {
      this.l6(var1);
   }

   @Override
   protected void b_(boolean var1) {
      try {
         if (var1) {
            this.l6(25);
         }
      } finally {
         super.b_(var1);
      }
   }

   @Override
   public void n5(int var1) {
      this.n5(16, Integer.valueOf(var1));
   }

   @Override
   public void n5(String var1) {
      this.n5(17, var1);
   }

   @Override
   public void n5() {
      this.l6(18);
   }

   @Override
   public void l6(String var1, String var2, String var3) {
      this.n5(19, var1, var2, var3);
   }

   @Override
   public void k5(String var1, String var2, String var3) {
      this.n5(20, var1, var2, var3);
   }

   @Override
   public void l6(String var1, String var2) {
      this.n5(21, var1, var2);
   }

   @Override
   public void c8() {
      this.l6(22);
   }

   private void l6(int var1) {
      int var2 = this.y4();
      this.l6[var2].n5(var1);
   }

   private void n5(int var1, String var2) {
      int var3 = this.y4();
      this.l6[var3].n5(var1, var2);
   }

   private void n5(int var1, String var2, String var3) {
      int var4 = this.y4();
      this.l6[var4].n5(var1, var2, var3);
   }

   private void n5(int var1, String var2, String var3, String var4) {
      int var5 = this.y4();
      this.l6[var5].n5(var1, var2, var3, var4);
   }

   private void n5(int var1, String var2, String var3, String var4, Object var5) {
      int var6 = this.y4();
      this.l6[var6].n5(var1, var2, var3, var4, var5);
   }

   private void n5(int var1, Object var2) {
      int var3 = this.y4();
      this.l6[var3].n5(var1, var2);
   }

   private int y4() {
      if (this.n5 == null) {
         this.n5 = new List<>();
         this.l6 = (v6$n5[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v6$n5.class), 32));
         this.n5.addItem(this.l6);
         if (this.a6.l6() != 0) {
            this.l6[0].n5(9, this.a6.k5());
            this.k5++;
            this.a6.n5();
         }
      } else if (this.k5 >= this.l6.length) {
         this.l6 = (v6$n5[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v6$n5.class), this.k5 * 2));
         this.n5.addItem(this.l6);
         this.k5 = 0;
      }

      return this.k5++;
   }

   private static byte[] k5(byte[] var0, int var1, int var2) {
      if (var1 == 0 && var2 == var0.length) {
         return var0;
      }

      if (var0.length - var1 > var2) {
         var2 = var0.length - var1;
      }

      byte[] var3 = new byte[var2];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var0)), var1, com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, var2);
      return var3;
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(v6$n5.class, new x0());
   }
}
