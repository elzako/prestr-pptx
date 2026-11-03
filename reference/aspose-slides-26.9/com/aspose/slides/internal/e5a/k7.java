package com.aspose.slides.internal.e5a;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.i9;

public class k7 {
   private static final com.aspose.slides.internal.l7h.j5 n5 = com.aspose.slides.internal.n2d.x8.n5("IBM437");
   private static final com.aspose.slides.internal.l7h.j5 l6 = com.aspose.slides.internal.n2d.x8.n5("UTF-8");
   private static final i9 k5 = new i9();

   public static String n5(String var0) {
      if (d1.l6(var0, "./")) {
         var0 = d1.k5(var0, 2);
      }

      var0 = d1.n5(var0, "/./", "/");
      com.aspose.slides.internal.r7c.c8 var1 = new com.aspose.slides.internal.r7c.c8("^(.*/)b?([^/\\\\.]+/\\\\.\\\\./)(.+)$");
      return var1.k5(var0, "$1$3");
   }

   public static String l6(String var0) {
      if (var0 != null && var0.length() != 0) {
         return var0.length() < 2 ? d1.n5(var0, '\\', '/') : d1.n5(var0.charAt(1) == ':' && var0.charAt(2) == '\\' ? d1.k5(var0, 3) : var0, '\\', '/');
      } else {
         return var0;
      }
   }

   public static byte[] n5(String var0, com.aspose.slides.internal.l7h.j5 var1) {
      return var1.u3(var0);
   }

   public static byte[] k5(String var0) {
      return n5(var0, n5);
   }

   public static String n5(byte[] var0) {
      return n5(var0, l6);
   }

   public static String n5(byte[] var0, com.aspose.slides.internal.l7h.j5 var1) {
      return var1.l6(var0, 0, var0.length);
   }

   public static int n5(com.aspose.slides.internal.z0k.t4 var0) {
      int var1 = 0;

      try {
         var1 = n5(var0, "nul");
      } catch (a6 var3) {
      }

      return var1;
   }

   public static int l6(com.aspose.slides.internal.z0k.t4 var0) {
      return n5(var0, "Could not read block - no data!  (position 0x{0:X8})");
   }

   private static int n5(com.aspose.slides.internal.z0k.t4 var0, String var1) {
      byte[] var2 = new byte[4];
      int var3 = var0.read(var2, 0, var2.length);
      if (var3 != var2.length) {
         throw new a6(d1.n5(var1, new Object[]{var0.getPosition()}));
      } else {
         return (((var2[3] & 0xFF) * 256 + (var2[2] & 0xFF)) * 256 + (var2[1] & 0xFF)) * 256 + (var2[0] & 0xFF);
      }
   }

   public static long n5(com.aspose.slides.internal.z0k.t4 var0, int var1) {
      long var2 = var0.getPosition();
      int var4 = 65536;
      byte[] var5 = new byte[]{(byte)(var1 >> 24), (byte)((var1 & 0xFF0000) >> 16), (byte)((var1 & 0xFF00) >> 8), (byte)(var1 & 0xFF)};
      byte[] var6 = new byte[var4];
      boolean var7 = false;

      label38:
      while (true) {
         int var8 = var0.read(var6, 0, var6.length);
         if (var8 == 0) {
            break;
         }

         int var9 = 0;

         while (true) {
            if (var9 >= var8) {
               break label38;
            }

            if (var6[var9] == var5[3]) {
               long var10 = var0.getPosition();
               var0.seek(var9 - var8, 1);
               int var12 = n5(var0);
               var7 = var12 == var1;
               if (var7) {
                  if (var7) {
                     break label38;
                  }
                  break;
               }

               var0.seek(var10, 0);
            }

            var9++;
         }
      }

      if (!var7) {
         var0.seek(var2, 0);
         return -1L;
      } else {
         return var0.getPosition() - var2 - 4L;
      }
   }

   public static com.aspose.slides.ms.System.j5 n5(com.aspose.slides.ms.System.j5 var0) {
      return var0;
   }

   public static com.aspose.slides.ms.System.j5 l6(com.aspose.slides.ms.System.j5 var0) {
      return var0;
   }

   public static com.aspose.slides.ms.System.j5 n5(int var0) {
      if (var0 != 65535 && var0 != 0) {
         short var1 = (short)(var0 & 65535);
         short var2 = (short)((var0 & 4294901760L & 4294967295L) >> 16);
         int var3 = 1980 + ((var2 & '︀') >> 9);
         int var4 = (var2 & 480) >> 5;
         int var5 = var2 & 31;
         int var6 = (var1 & '\uf800') >> 11;
         int var7 = (var1 & 2016) >> 5;
         int var8 = (var1 & 31) * 2;
         if (var8 >= 60) {
            var7++;
            var8 = 0;
         }

         if (var7 >= 60) {
            var6++;
            var7 = 0;
         }

         if (var6 >= 24) {
            var5++;
            var6 = 0;
         }

         com.aspose.slides.ms.System.j5 var9 = com.aspose.slides.ms.System.j5.s7().m3();
         boolean var10 = false;

         try {
            var9 = new com.aspose.slides.ms.System.j5(var3, var4, var5, var6, var7, var8, 0);
            var10 = true;
         } catch (ArgumentOutOfRangeException var17) {
            if (var3 == 1980 && var4 == 0 && var5 == 0) {
               try {
                  var9 = new com.aspose.slides.ms.System.j5(1980, 1, 1, var6, var7, var8, 0);
                  var10 = true;
               } catch (ArgumentOutOfRangeException var15) {
                  try {
                     var9 = new com.aspose.slides.ms.System.j5(1980, 1, 1, 0, 0, 0, 0);
                     var10 = true;
                  } catch (ArgumentOutOfRangeException var14) {
                  }
               }
            } else {
               try {
                  while (var3 < 1980) {
                     var3++;
                  }

                  while (var3 > 2030) {
                     var3--;
                  }

                  while (var4 < 1) {
                     var4++;
                  }

                  while (var4 > 12) {
                     var4--;
                  }

                  while (var5 < 1) {
                     var5++;
                  }

                  while (var5 > 28) {
                     var5--;
                  }

                  while (var7 < 0) {
                     var7++;
                  }

                  while (var7 > 59) {
                     var7--;
                  }

                  while (var8 < 0) {
                     var8++;
                  }

                  while (var8 > 59) {
                     var8--;
                  }

                  var9 = new com.aspose.slides.ms.System.j5(var3, var4, var5, var6, var7, var8, 0);
                  var10 = true;
               } catch (ArgumentOutOfRangeException var16) {
               }
            }
         }

         if (!var10) {
            String var11 = d1.n5("y({0}) m({1}) d({2}) h({3}) m({4}) s({5})",new Object[]{ var3, var4, var5, var6, var7, var8});
            throw new a0(d1.n5("Bad date/time format in the zip file. ({0})", new Object[]{var11}));
         } else {
            return var9;
         }
      } else {
         return new com.aspose.slides.ms.System.j5(1995, 1, 1, 0, 0, 0, 0);
      }
   }

   public static int k5(com.aspose.slides.ms.System.j5 var0) {
      var0.q0().u3(var0);
      l6(var0.m3()).u3(var0);
      int var1 = (var0.l6() & 31 | var0.c8() << 5 & 480 | var0.e2() - 1980 << 9 & 65024) & 65535;
      int var2 = (var0.x8() / 2 & 31 | var0.h0() << 5 & 2016 | var0.u3() << 11 & 63488) & 65535;
      return (int)((var1 & 65535) << 16 & 4294967295L & 4294967295L | var2 & 65535);
   }

   public static String n5() {
      String var0;
      do {
         var0 = d1.n5(new String[]{"DotNetZip-", n5(8, 97), ".tmp"});
      } while (com.aspose.slides.internal.z0k.u9.k5(var0));

      return var0;
   }

   private static String n5(int var0, int var1) {
      boolean var2 = var1 == 0;
      String var3 = d1.n5;
      char[] var4 = new char[var0];

      for (int var5 = 0; var5 < var0; var5++) {
         if (var2) {
            var1 = k5.n5(2) == 0 ? 65 : 97;
         }

         var4[var5] = l6(var1);
      }

      return d1.n5(var4);
   }

   private static char l6(int var0) {
      return (char)(k5.n5(26) + var0);
   }

   public static int n5(com.aspose.slides.internal.z0k.t4 var0, byte[] var1, int var2, int var3, String var4) {
      return var0.read(var1, var2, var3);
   }
}
