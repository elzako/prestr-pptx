package com.aspose.slides.internal.g1;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x9;

public class h0 {
   private static final com.aspose.slides.internal.y6.h0 n5 = new com.aspose.slides.internal.y6.h0((byte)-14, (byte)-12, (byte)-13);

   public static com.aspose.slides.internal.y6.h0 n5(com.aspose.slides.internal.y6.h0 var0, com.aspose.slides.internal.y6.h0 var1) {
      byte var2 = (byte)(var0.k5() & 0xFF | var1.k5() & 0xFF);
      byte var3 = (byte)(var0.u3() & 0xFF | var1.u3() & 0xFF);
      byte var4 = (byte)(var0.a6() & 0xFF | var1.a6() & 0xFF);
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.y6.n5.class)
         && com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.y6.n5.class)) {
         byte var9 = (byte)(
            com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.y6.n5.class).n5() & 0xFF
               | com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.y6.n5.class).n5() & 0xFF
         );
         return new com.aspose.slides.internal.y6.n5(var9, var2, var3, var4);
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.y6.n5.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.y6.n5.class)) {
         return new com.aspose.slides.internal.y6.h0(var2, var3, var4);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.y6.n5.class)) {
         if ((com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.y6.n5.class).n5() & 255) == 0) {
            byte var7 = (byte)(((var1.k5() & 255) + (var1.u3() & 255) + (var1.a6() & 255)) / 3);
            var7 = (byte)((var7 & 255) > 128 ? 255 : 0);
            return (var7 & 255) == 0
               ? new com.aspose.slides.internal.y6.n5(com.aspose.slides.internal.o9b.c8.u3.o8())
               : new com.aspose.slides.internal.y6.h0(var2, var3, var4);
         } else {
            return new com.aspose.slides.internal.y6.h0(var2, var3, var4);
         }
      } else if ((com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.y6.n5.class).n5() & 255) == 0) {
         byte var5 = (byte)(((var0.k5() & 255) + (var0.u3() & 255) + (var1.a6() & 255)) / 3);
         var5 = (byte)((var5 & 255) > 128 ? 255 : 0);
         return (var5 & 255) == 0
            ? new com.aspose.slides.internal.y6.n5(com.aspose.slides.internal.o9b.c8.u3.o8())
            : new com.aspose.slides.internal.y6.h0(var2, var3, var4);
      } else {
         return new com.aspose.slides.internal.y6.h0(var2, var3, var4);
      }
   }

   public static com.aspose.slides.internal.y6.h0 l6(com.aspose.slides.internal.y6.h0 var0, com.aspose.slides.internal.y6.h0 var1) {
      byte var2 = (byte)(var0.k5() & 0xFF & var1.k5() & 0xFF);
      byte var3 = (byte)(var0.u3() & 0xFF & var1.u3() & 0xFF);
      byte var4 = (byte)(var0.a6() & 0xFF & var1.a6() & 0xFF);
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.y6.n5.class)
         && com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.y6.n5.class)) {
         byte var9 = (byte)(
            com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.y6.n5.class).n5()
               & 0xFF
               & com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.y6.n5.class).n5()
               & 0xFF
         );
         return new com.aspose.slides.internal.y6.n5(var9, var2, var3, var4);
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.y6.n5.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.y6.n5.class)) {
         return new com.aspose.slides.internal.y6.h0(var2, var3, var4);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.y6.n5.class)) {
         if ((com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.y6.n5.class).n5() & 255) == 0) {
            byte var7 = (byte)(255 - ((var1.k5() & 255) + (var1.u3() & 255) + (var1.a6() & 255)) / 3);
            var7 = (byte)((var7 & 255) > 0 ? 255 : 0);
            return (var7 & 255) == 0
               ? new com.aspose.slides.internal.y6.n5(com.aspose.slides.internal.o9b.c8.u3.o8())
               : new com.aspose.slides.internal.y6.h0(var2, var3, var4);
         } else {
            return new com.aspose.slides.internal.y6.h0(var2, var3, var4);
         }
      } else if ((com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.y6.n5.class).n5() & 255) == 0) {
         byte var5 = (byte)(255 - ((var0.k5() & 255) + (var0.u3() & 255) + (var0.a6() & 255)) / 3);
         var5 = (byte)((var5 & 255) > 0 ? 255 : 0);
         return (var5 & 255) == 0
            ? new com.aspose.slides.internal.y6.n5(com.aspose.slides.internal.o9b.c8.u3.o8())
            : new com.aspose.slides.internal.y6.h0(var2, var3, var4);
      } else {
         return new com.aspose.slides.internal.y6.h0(var2, var3, var4);
      }
   }

   public static com.aspose.slides.internal.y6.h0 k5(com.aspose.slides.internal.y6.h0 var0, com.aspose.slides.internal.y6.h0 var1) {
      return n5(l6(var0, var1));
   }

   public static com.aspose.slides.internal.y6.h0 u3(com.aspose.slides.internal.y6.h0 var0, com.aspose.slides.internal.y6.h0 var1) {
      return k5(k5(var0, k5(var0, var1)), k5(var1, k5(var0, var1)));
   }

   public static com.aspose.slides.internal.y6.h0 n5(com.aspose.slides.internal.y6.h0 var0) {
      if (var0.equals(n5)) {
         return new com.aspose.slides.internal.y6.n5(com.aspose.slides.internal.o9b.c8.u3.o8());
      }

      byte var1 = (byte)(~(var0.k5() & 255));
      byte var2 = (byte)(~(var0.u3() & 255));
      byte var3 = (byte)(~(var0.a6() & 255));
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.y6.n5.class)) {
         if (var0.l6().h0() == 0) {
            return n5;
         } else if ((com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.y6.n5.class).n5() & 255) != 0) {
            float var4 = ((var1 & 255) + (var2 & 255) + (var3 & 255)) / 3.0F / 255.0F;
            byte var5 = com.aspose.slides.internal.v6g.k5.n5((Object)(255.0F * var4), (int)(13));
            var5 = (byte)((var5 & 255) > 128 ? 255 : 0);
            return (var5 & 255) == 0
               ? new com.aspose.slides.internal.y6.n5(com.aspose.slides.internal.o9b.c8.u3.o8())
               : new com.aspose.slides.internal.y6.h0(var1, var2, var3);
         } else {
            return new com.aspose.slides.internal.y6.h0(com.aspose.slides.internal.o9b.c8.w4().o8());
         }
      } else {
         return new com.aspose.slides.internal.y6.h0(var1, var2, var3);
      }
   }

   public static com.aspose.slides.internal.y6.h0 n5(
      com.aspose.slides.internal.y6.h0 var0, com.aspose.slides.internal.y6.h0 var1, com.aspose.slides.internal.y6.h0 var2, long var3
   ) {
      com.aspose.slides.internal.y6.h0 var5 = var1;
      switch ((int)var3) {
         case 0:
            var5 = new com.aspose.slides.internal.y6.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
            break;
         case 1:
            var5 = n5(n5(var1, n5(var2, var0)));
            break;
         case 2:
            var5 = l6(var1, n5(n5(var2, var0)));
            break;
         case 3:
            var5 = n5(n5(var2, var0));
            break;
         case 4:
            var5 = l6(var0, n5(n5(var1, var2)));
            break;
         case 5:
            var5 = n5(n5(var1, var2));
            break;
         case 6:
            var5 = n5(n5(var2, n5(u3(var1, var0))));
            break;
         case 7:
            var5 = n5(n5(var2, l6(var1, var0)));
            break;
         case 8:
            var5 = l6(var0, l6(var1, n5(var2)));
            break;
         case 9:
            var5 = n5(n5(var2, u3(var1, var0)));
            break;
         case 10:
            var5 = l6(var1, n5(var2));
            break;
         case 11:
            var5 = n5(n5(var2, l6(var0, n5(var1))));
            break;
         case 12:
            var5 = l6(var0, n5(var2));
            break;
         case 13:
            var5 = n5(n5(l6(n5(var0), var1), var2));
            break;
         case 14:
            var5 = n5(n5(n5(n5(var1, var0)), var2));
            break;
         case 15:
            var5 = n5(var2);
            break;
         case 16:
            var5 = l6(n5(n5(var1, var0)), var2);
            break;
         case 17:
            var5 = n5(n5(var0, var1));
            break;
         case 18:
            var5 = n5(n5(n5(u3(var2, var1)), var0));
            break;
         case 19:
            var5 = n5(n5(l6(var2, var1), var0));
            break;
         case 20:
            var5 = n5(n5(n5(u3(var0, var2)), var1));
            break;
         case 21:
            var5 = n5(n5(l6(var0, var2), var1));
            break;
         case 22:
            var5 = u3(u3(l6(n5(l6(var0, var2)), var1), var0), var2);
            break;
         case 23:
            var5 = n5(u3(l6(u3(var0, var1), u3(var2, var0)), var0));
            break;
         case 24:
            var5 = l6(u3(var1, var2), u3(var2, var0));
            break;
         case 25:
            var5 = n5(u3(l6(n5(l6(var0, var2)), var1), var0));
            break;
         case 26:
            var5 = u3(n5(l6(var2, var0), var1), var2);
            break;
         case 27:
            var5 = n5(u3(l6(u3(var0, var2), var1), var0));
            break;
         case 28:
            var5 = u3(n5(l6(var2, var1), var0), var2);
            break;
         case 29:
            var5 = n5(u3(l6(u3(var1, var2), var0), var1));
            break;
         case 30:
            var5 = u3(n5(var0, var1), var2);
            break;
         case 31:
            var5 = n5(l6(n5(var0, var1), var2));
            break;
         case 32:
            var5 = l6(l6(n5(var0), var2), var1);
            break;
         case 33:
            var5 = n5(n5(u3(var2, var1), var0));
            break;
         case 34:
            var5 = l6(n5(var0), var1);
            break;
         case 35:
            var5 = n5(n5(l6(n5(var1), var2), var0));
            break;
         case 36:
            var5 = l6(u3(var0, var1), u3(var2, var0));
            break;
         case 37:
            var5 = n5(u3(l6(n5(l6(var2, var0)), var1), var2));
            break;
         case 38:
            var5 = u3(n5(l6(var0, var2), var1), var0);
            break;
         case 39:
            var5 = u3(n5(n5(u3(var0, var2)), var1), var0);
            break;
         case 40:
            var5 = l6(u3(var0, var2), var1);
            break;
         case 41:
            var5 = n5(u3(u3(n5(l6(var0, var2), var1), var0), var2));
            break;
         case 42:
            var5 = l6(n5(l6(var0, var2)), var1);
            break;
         case 43:
            var5 = n5(u3(l6(u3(var1, var2), u3(var2, var0)), var0));
            break;
         case 44:
            var5 = u3(l6(n5(var0, var1), var2), var0);
            break;
         case 45:
            var5 = u3(n5(n5(var1), var0), var2);
            break;
         case 46:
            var5 = u3(n5(u3(var2, var1), var0), var2);
            break;
         case 47:
            var5 = n5(l6(n5(n5(var1), var0), var2));
            break;
         case 48:
            var5 = l6(n5(var0), var2);
            break;
         case 49:
            var5 = n5(n5(l6(n5(var2), var1), var0));
            break;
         case 50:
            var5 = u3(n5(n5(var0, var2), var1), var0);
            break;
         case 51:
            var5 = n5(var0);
            break;
         case 52:
            var5 = u3(n5(l6(var0, var1), var2), var0);
            break;
         case 53:
            var5 = u3(n5(n5(u3(var0, var1)), var2), var0);
            break;
         case 54:
            var5 = u3(n5(var2, var1), var0);
            break;
         case 55:
            var5 = n5(l6(n5(var2, var1), var0));
            break;
         case 56:
            var5 = u3(l6(n5(var2, var1), var0), var2);
            break;
         case 57:
            var5 = u3(n5(n5(var1), var2), var0);
            break;
         case 58:
            var5 = u3(n5(u3(var0, var1), var2), var0);
            break;
         case 59:
            var5 = n5(l6(n5(n5(var1), var2), var0));
            break;
         case 60:
            var5 = u3(var0, var2);
            break;
         case 61:
            var5 = u3(n5(n5(n5(var0, var1)), var2), var0);
            break;
         case 62:
            var5 = u3(n5(l6(n5(var0), var1), var2), var0);
            break;
         case 63:
            var5 = n5(l6(var0, var2));
            break;
         case 64:
            var5 = l6(l6(n5(var1), var0), var2);
            break;
         case 65:
            var5 = n5(n5(u3(var0, var2), var1));
            break;
         case 66:
            var5 = l6(u3(var1, var2), u3(var1, var0));
            break;
         case 67:
            var5 = n5(u3(l6(n5(l6(var0, var1)), var2), var0));
            break;
         case 68:
            var5 = l6(n5(var1), var0);
            break;
         case 69:
            var5 = n5(n5(l6(n5(var0), var2), var1));
            break;
         case 70:
            var5 = u3(n5(l6(var1, var2), var0), var1);
            break;
         case 71:
            var5 = n5(u3(l6(u3(var2, var1), var0), var2));
            break;
         case 72:
            var5 = l6(u3(var2, var1), var0);
            break;
         case 73:
            var5 = n5(u3(u3(n5(l6(var1, var2), var0), var1), var2));
            break;
         case 74:
            var5 = u3(l6(n5(var1, var0), var2), var1);
            break;
         case 75:
            var5 = u3(n5(n5(var0), var1), var2);
            break;
         case 76:
            var5 = l6(n5(l6(var2, var1)), var0);
            break;
         case 77:
            var5 = n5(u3(n5(u3(var0, var1), u3(var2, var0)), var0));
            break;
         case 78:
            var5 = u3(n5(u3(var2, var0), var1), var2);
            break;
         case 79:
            var5 = n5(l6(n5(n5(var0), var1), var2));
            break;
         case 80:
            var5 = l6(n5(var1), var2);
            break;
         case 81:
            var5 = n5(n5(l6(n5(var2), var0), var1));
            break;
         case 82:
            var5 = u3(n5(l6(var1, var0), var2), var1);
            break;
         case 83:
            var5 = n5(u3(l6(u3(var0, var1), var2), var0));
            break;
         case 84:
            var5 = n5(n5(n5(n5(var0, var2)), var1));
            break;
         case 85:
            var5 = n5(var1);
            break;
         case 86:
            var5 = u3(n5(var0, var2), var1);
            break;
         case 87:
            var5 = n5(l6(n5(var0, var2), var1));
            break;
         case 88:
            var5 = u3(l6(n5(var2, var0), var1), var2);
            break;
         case 89:
            var5 = u3(n5(n5(var0), var2), var1);
            break;
         case 90:
            var5 = u3(var2, var1);
            break;
         case 91:
            var5 = u3(n5(n5(n5(var1, var0)), var2), var1);
            break;
         case 92:
            var5 = u3(n5(u3(var1, var0), var2), var1);
            break;
         case 93:
            var5 = n5(l6(n5(n5(var0), var2), var1));
            break;
         case 94:
            var5 = u3(n5(l6(n5(var1), var0), var2), var1);
            break;
         case 95:
            var5 = n5(l6(var2, var1));
            break;
         case 96:
            var5 = l6(u3(var0, var1), var2);
            break;
         case 97:
            var5 = n5(u3(u3(n5(l6(var0, var1), var2), var0), var1));
            break;
         case 98:
            var5 = u3(l6(n5(var1, var2), var0), var1);
            break;
         case 99:
            var5 = u3(n5(n5(var2), var1), var0);
            break;
         case 100:
            var5 = u3(l6(n5(var0, var2), var1), var0);
            break;
         case 101:
            var5 = u3(n5(n5(var2), var0), var1);
            break;
         case 102:
            var5 = u3(var0, var1);
            break;
         case 103:
            var5 = u3(n5(n5(n5(var0, var2)), var1), var0);
            break;
         case 104:
            var5 = n5(u3(u3(n5(n5(n5(var0, var1)), var2), var0), var1));
            break;
         case 105:
            var5 = n5(u3(u3(var0, var1), var2));
            break;
         case 106:
            var5 = u3(l6(var0, var2), var1);
            break;
         case 107:
            var5 = n5(u3(u3(l6(n5(var0, var2), var1), var0), var2));
            break;
         case 108:
            var5 = u3(l6(var2, var1), var0);
            break;
         case 109:
            var5 = n5(u3(u3(l6(n5(var1, var2), var0), var1), var2));
            break;
         case 110:
            var5 = u3(l6(n5(n5(var0), var2), var1), var0);
            break;
         case 111:
            var5 = n5(l6(n5(u3(var0, var1)), var2));
            break;
         case 112:
            var5 = l6(n5(l6(var0, var1)), var2);
            break;
         case 113:
            var5 = n5(u3(l6(u3(var1, var2), u3(var1, var0)), var0));
            break;
         case 114:
            var5 = u3(n5(u3(var0, var2), var1), var0);
            break;
         case 115:
            var5 = n5(l6(n5(n5(var2), var1), var0));
            break;
         case 116:
            var5 = u3(n5(u3(var1, var2), var0), var1);
            break;
         case 117:
            var5 = n5(l6(n5(n5(var2), var0), var1));
            break;
         case 118:
            var5 = u3(n5(l6(n5(var0), var2), var1), var0);
            break;
         case 119:
            var5 = n5(l6(var0, var1));
            break;
         case 120:
            var5 = u3(l6(var0, var1), var2);
            break;
         case 121:
            var5 = n5(u3(u3(l6(n5(var0, var1), var2), var0), var1));
            break;
         case 122:
            var5 = u3(l6(n5(n5(var1), var0), var2), var1);
            break;
         case 123:
            var5 = n5(l6(n5(u3(var2, var1)), var0));
            break;
         case 124:
            var5 = u3(l6(n5(n5(var0), var1), var2), var0);
            break;
         case 125:
            var5 = n5(l6(n5(u3(var0, var2)), var1));
            break;
         case 126:
            var5 = n5(u3(var0, var1), u3(var2, var0));
            break;
         case 127:
            var5 = n5(l6(l6(var0, var2), var1));
            break;
         case 128:
            var5 = l6(l6(var0, var2), var1);
            break;
         case 129:
            var5 = n5(n5(u3(var0, var1), u3(var2, var0)));
            break;
         case 130:
            var5 = l6(n5(u3(var0, var2)), var1);
            break;
         case 131:
            var5 = n5(u3(l6(n5(n5(var0), var1), var2), var0));
            break;
         case 132:
            var5 = l6(n5(u3(var2, var1)), var0);
            break;
         case 133:
            var5 = n5(u3(l6(n5(n5(var2), var0), var1), var2));
            break;
         case 134:
            var5 = u3(u3(l6(n5(var0, var1), var2), var0), var1);
            break;
         case 135:
            var5 = n5(u3(l6(var0, var1), var2));
            break;
         case 136:
            var5 = l6(var0, var1);
            break;
         case 137:
            var5 = n5(u3(n5(l6(n5(var0), var2), var1), var0));
            break;
         case 138:
            var5 = l6(n5(n5(var2), var0), var1);
            break;
         case 139:
            var5 = n5(u3(n5(u3(var1, var2), var0), var1));
            break;
         case 140:
            var5 = l6(n5(n5(var2), var1), var0);
            break;
         case 141:
            var5 = n5(u3(n5(u3(var0, var2), var1), var0));
            break;
         case 142:
            var5 = u3(l6(u3(var1, var2), u3(var1, var0)), var0);
            break;
         case 143:
            var5 = n5(l6(n5(l6(var0, var1)), var2));
            break;
         case 144:
            var5 = l6(n5(u3(var0, var1)), var2);
            break;
         case 145:
            var5 = n5(u3(l6(n5(n5(var0), var2), var1), var0));
            break;
         case 146:
            var5 = u3(u3(l6(n5(var2, var1), var0), var2), var1);
            break;
         case 147:
            var5 = n5(u3(l6(var1, var2), var0));
            break;
         case 148:
            var5 = u3(u3(l6(n5(var0, var2), var1), var0), var2);
            break;
         case 149:
            var5 = n5(u3(l6(var0, var2), var1));
            break;
         case 150:
            var5 = u3(u3(var0, var2), var1);
            break;
         case 151:
            var5 = u3(u3(n5(n5(n5(var0, var2)), var1), var0), var2);
            break;
         case 152:
            var5 = n5(u3(n5(n5(n5(var0, var2)), var1), var0));
            break;
         case 153:
            var5 = n5(u3(var0, var1));
            break;
         case 154:
            var5 = u3(l6(n5(var0), var2), var1);
            break;
         case 155:
            var5 = n5(u3(l6(n5(var0, var2), var1), var0));
            break;
         case 156:
            var5 = u3(l6(n5(var1), var2), var0);
            break;
         case 157:
            var5 = n5(u3(l6(n5(var1, var2), var0), var1));
            break;
         case 158:
            var5 = u3(u3(n5(l6(var0, var1), var2), var0), var1);
            break;
         case 159:
            var5 = n5(l6(u3(var0, var1), var2));
            break;
         case 160:
            var5 = l6(var2, var1);
            break;
         case 161:
            var5 = n5(u3(n5(l6(n5(var2), var0), var1), var2));
            break;
         case 162:
            var5 = l6(n5(n5(var0), var2), var1);
            break;
         case 163:
            var5 = n5(u3(n5(u3(var1, var0), var2), var1));
            break;
         case 164:
            var5 = n5(u3(n5(n5(n5(var2, var0)), var1), var2));
            break;
         case 165:
            var5 = n5(u3(var1, var2));
            break;
         case 166:
            var5 = u3(l6(n5(var2), var0), var1);
            break;
         case 167:
            var5 = n5(u3(l6(n5(var2, var0), var1), var2));
            break;
         case 168:
            var5 = l6(n5(var0, var2), var1);
            break;
         case 169:
            var5 = n5(u3(n5(var0, var2), var1));
            break;
         case 170:
            var5 = var1;
            break;
         case 171:
            var5 = n5(n5(n5(var0, var2)), var1);
            break;
         case 172:
            var5 = u3(l6(u3(var0, var1), var2), var0);
            break;
         case 173:
            var5 = n5(u3(n5(l6(var1, var0), var2), var1));
            break;
         case 174:
            var5 = n5(l6(n5(var2), var0), var1);
            break;
         case 175:
            var5 = n5(n5(var2), var1);
            break;
         case 176:
            var5 = l6(n5(n5(var0), var1), var2);
            break;
         case 177:
            var5 = n5(u3(n5(u3(var2, var0), var1), var2));
            break;
         case 178:
            var5 = u3(n5(u3(var0, var1), u3(var2, var0)), var0);
            break;
         case 179:
            var5 = n5(l6(n5(l6(var2, var1)), var0));
            break;
         case 180:
            var5 = u3(l6(n5(var1), var0), var2);
            break;
         case 181:
            var5 = n5(u3(l6(n5(var1, var0), var2), var1));
            break;
         case 182:
            var5 = u3(u3(n5(l6(var2, var1), var0), var2), var1);
            break;
         case 183:
            var5 = n5(l6(u3(var2, var1), var0));
            break;
         case 184:
            var5 = u3(l6(u3(var2, var1), var0), var2);
            break;
         case 185:
            var5 = n5(u3(n5(l6(var1, var2), var0), var1));
            break;
         case 186:
            var5 = n5(l6(n5(var0), var2), var1);
            break;
         case 187:
            var5 = n5(n5(var0), var1);
            break;
         case 188:
            var5 = u3(l6(n5(l6(var0, var1)), var2), var0);
            break;
         case 189:
            var5 = n5(l6(u3(var1, var2), u3(var1, var0)));
            break;
         case 190:
            var5 = n5(u3(var0, var2), var1);
            break;
         case 191:
            var5 = n5(n5(l6(var0, var2)), var1);
            break;
         case 192:
            var5 = l6(var0, var2);
            break;
         case 193:
            var5 = n5(u3(n5(l6(n5(var0), var1), var2), var0));
            break;
         case 194:
            var5 = n5(u3(n5(n5(n5(var0, var1)), var2), var0));
            break;
         case 195:
            var5 = n5(u3(var0, var2));
            break;
         case 196:
            var5 = l6(n5(n5(var1), var2), var0);
            break;
         case 197:
            var5 = n5(u3(n5(u3(var0, var1), var2), var0));
            break;
         case 198:
            var5 = u3(l6(n5(var2), var1), var0);
            break;
         case 199:
            var5 = n5(u3(l6(n5(var2, var1), var0), var2));
            break;
         case 200:
            var5 = l6(n5(var2, var1), var0);
            break;
         case 201:
            var5 = n5(u3(n5(var1, var2), var0));
            break;
         case 202:
            var5 = u3(l6(u3(var1, var0), var2), var1);
            break;
         case 203:
            var5 = n5(u3(n5(l6(var0, var1), var2), var0));
            break;
         case 204:
            var5 = var0;
            break;
         case 205:
            var5 = n5(n5(n5(var2, var1)), var0);
            break;
         case 206:
            var5 = n5(l6(n5(var2), var1), var0);
            break;
         case 207:
            var5 = n5(n5(var2), var0);
            break;
         case 208:
            var5 = l6(n5(n5(var1), var0), var2);
            break;
         case 209:
            var5 = n5(u3(n5(u3(var2, var1), var0), var2));
            break;
         case 210:
            var5 = u3(l6(n5(var0), var1), var2);
            break;
         case 211:
            var5 = n5(u3(l6(n5(var0, var1), var2), var0));
            break;
         case 212:
            var5 = u3(l6(u3(var1, var2), u3(var2, var0)), var0);
            break;
         case 213:
            var5 = n5(l6(n5(l6(var0, var2)), var1));
            break;
         case 214:
            var5 = u3(u3(n5(l6(var0, var2), var1), var0), var2);
            break;
         case 215:
            var5 = n5(l6(u3(var0, var2), var1));
            break;
         case 216:
            var5 = u3(l6(u3(var2, var0), var1), var2);
            break;
         case 217:
            var5 = n5(u3(n5(l6(var0, var2), var1), var0));
            break;
         case 218:
            var5 = u3(l6(n5(l6(var1, var0)), var2), var1);
            break;
         case 219:
            var5 = n5(l6(u3(var0, var1), u3(var2, var0)));
            break;
         case 220:
            var5 = n5(l6(n5(var1), var2), var0);
            break;
         case 221:
            var5 = n5(n5(var1), var0);
            break;
         case 222:
            var5 = n5(u3(var2, var1), var0);
            break;
         case 223:
            var5 = n5(n5(l6(var2, var1)), var0);
            break;
         case 224:
            var5 = l6(n5(var0, var1), var2);
            break;
         case 225:
            var5 = n5(u3(n5(var0, var1), var2));
            break;
         case 226:
            var5 = u3(l6(u3(var1, var2), var0), var1);
            break;
         case 227:
            var5 = n5(u3(n5(l6(var2, var1), var0), var2));
            break;
         case 228:
            var5 = u3(l6(u3(var0, var2), var1), var0);
            break;
         case 229:
            var5 = n5(u3(n5(l6(var2, var0), var1), var2));
            break;
         case 230:
            var5 = u3(l6(n5(l6(var0, var2)), var1), var0);
            break;
         case 231:
            var5 = n5(l6(u3(var1, var2), u3(var2, var0)));
            break;
         case 232:
            var5 = u3(l6(u3(var0, var1), u3(var2, var0)), var0);
            break;
         case 233:
            var5 = n5(u3(u3(l6(n5(l6(var0, var1)), var2), var0), var1));
            break;
         case 234:
            var5 = n5(l6(var0, var2), var1);
            break;
         case 235:
            var5 = n5(n5(u3(var0, var2)), var1);
            break;
         case 236:
            var5 = n5(l6(var2, var1), var0);
            break;
         case 237:
            var5 = n5(n5(u3(var2, var1)), var0);
            break;
         case 238:
            var5 = n5(var0, var1);
            break;
         case 239:
            var5 = n5(n5(n5(var2), var1), var0);
            break;
         case 240:
            var5 = var2;
            break;
         case 241:
            var5 = n5(n5(n5(var0, var1)), var2);
            break;
         case 242:
            var5 = n5(l6(n5(var0), var1), var2);
            break;
         case 243:
            var5 = n5(n5(var0), var2);
            break;
         case 244:
            var5 = n5(l6(n5(var1), var0), var2);
            break;
         case 245:
            var5 = n5(n5(var1), var2);
            break;
         case 246:
            var5 = n5(u3(var0, var1), var2);
            break;
         case 247:
            var5 = n5(n5(l6(var0, var1)), var2);
            break;
         case 248:
            var5 = n5(l6(var0, var1), var2);
            break;
         case 249:
            var5 = n5(n5(u3(var0, var1)), var2);
            break;
         case 250:
            var5 = n5(var2, var1);
            break;
         case 251:
            var5 = n5(n5(n5(var0), var2), var1);
            break;
         case 252:
            var5 = n5(var0, var2);
            break;
         case 253:
            var5 = n5(n5(n5(var1), var0), var2);
            break;
         case 254:
            var5 = n5(n5(var0, var2), var1);
            break;
         case 255:
            var5 = new com.aspose.slides.internal.y6.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
      }

      return var5;
   }

   public static com.aspose.slides.internal.o9b.l6 n5(
      com.aspose.slides.internal.o9b.l6 var0, com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.l6 var2, long var3, u9 var5
   ) {
      y2 var6 = new y2(0, 0, var2.e2(), var2.h0());
      com.aspose.slides.internal.j9e.n5 var7 = var0.n5(var6.n3(), 1, 2498570);
      com.aspose.slides.internal.j9e.n5 var8 = var1.n5(var6.n3(), 1, 2498570);
      com.aspose.slides.internal.j9e.n5 var9 = var2.n5(var6.n3(), 3, 2498570);
      x9 var10 = var7.u3();
      x9 var11 = var9.u3();
      x9 var12 = var8.u3();

      for (int var13 = 0; var13 < var7.n5(); var13++) {
         int var14 = q1.n5(var7.a6());
         byte[] var15 = new byte[var14];
         byte[] var16 = new byte[var14];
         byte[] var17 = new byte[var14];
         com.aspose.slides.internal.e3m.n5.n5(var10, var15, 0, var14);
         com.aspose.slides.internal.e3m.n5.n5(var11, var16, 0, var14);
         com.aspose.slides.internal.e3m.n5.n5(var12, var17, 0, var14);

         for (int var18 = 0; var18 < var14; var18 += 4) {
            com.aspose.slides.internal.o9b.c8 var19 = com.aspose.slides.internal.o9b.c8.n5(
                  var15[var18 + 3] & 255, var15[var18 + 2] & 255, var15[var18 + 1] & 255, var15[var18] & 255
               )
               .o8();
            com.aspose.slides.internal.y6.h0 var20 = new com.aspose.slides.internal.y6.h0(var19.o8());
            com.aspose.slides.internal.o9b.c8 var21 = com.aspose.slides.internal.o9b.c8.n5(
                  var16[var18 + 3] & 255, var16[var18 + 2] & 255, var16[var18 + 1] & 255, var16[var18] & 255
               )
               .o8();
            com.aspose.slides.internal.y6.n5 var22 = new com.aspose.slides.internal.y6.n5(var21.o8());
            com.aspose.slides.internal.o9b.c8 var23 = com.aspose.slides.internal.o9b.c8.n5(
                  var17[var18 + 3] & 255, var17[var18 + 2] & 255, var17[var18 + 1] & 255, var17[var18] & 255
               )
               .o8();
            com.aspose.slides.internal.y6.h0 var24 = new com.aspose.slides.internal.y6.h0(var23.o8());
            com.aspose.slides.internal.y6.h0 var25 = n5(var20, var22, var24, var3);
            com.aspose.slides.internal.o9b.c8 var26 = var25.l6().o8();
            var16[var18] = var26.y4();
            var16[var18 + 1] = var26.n3();
            var16[var18 + 2] = var26.x8();
            var16[var18 + 3] = var26.s7();
         }

         com.aspose.slides.internal.e3m.n5.n5(var16, 0, var11, var14);
         var10 = new x9(var10.l6() + var14);
         var11 = new x9(var11.l6() + var14);
         var12 = new x9(var12.l6() + var14);
      }

      var0.n5(var7);
      var1.n5(var8);
      var2.n5(var9);
      return var2;
   }

   public static y2 n5(y2 var0, y2 var1) {
      return y2.n5(var1.n3(), var0.n3());
   }
}
