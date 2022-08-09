package ir.MrMohamadHosein.notification

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import ir.MrMohamadHosein.notification.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn1.setOnClickListener {

            // big picture style =>
            val intent = Intent(this , MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK.or(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            val pendingIntent = PendingIntent.getActivity(this , 12 , intent , 0)

            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

            val notification = NotificationCompat
                .Builder( this , "myNotif" )
                .setSmallIcon( android.R.drawable.stat_notify_chat )
                .setLargeIcon( BitmapFactory.decodeResource(resources , R.drawable.notif) )
                .setContentTitle("Sam Jefry")
                .setContentText("Let's have a dinner...")
                .setContentIntent(pendingIntent)
                .setStyle(
                    NotificationCompat.BigPictureStyle()
                        .bigPicture(
                            BitmapFactory.decodeResource(resources , R.drawable.big_pic)
                        )
                )
                .build()

            notificationManager.notify( (10..1000).random() , notification )

        }

        binding.btn2.setOnClickListener {

            // Big Text Style =>
            val intent = Intent(this , MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK.or(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            val pendingIntent = PendingIntent.getActivity(this , 12 , intent , 0)

            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

            val notification = NotificationCompat
                .Builder( this , "myNotif" )
                .setSmallIcon( android.R.drawable.stat_notify_chat )
                .setLargeIcon( BitmapFactory.decodeResource(resources , R.drawable.notif) )
                .setContentTitle("Sam Jefry")
                .setContentText("Let's have a dinner...")
                .setContentIntent(pendingIntent)
                .setStyle(
                    NotificationCompat.BigTextStyle()
                        .bigText( "In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before the final copy is available. It is also used to temporarily replace text in a process called greeking, which allows designers to consider the form of a webpage or publication, without the meaning of the text influencing the design" )
                )
                .build()

            notificationManager.notify( (10..1000).random() , notification )

        }

        binding.btn3.setOnClickListener {

            // Inbox style =>
            val intent = Intent(this , MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK.or(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            val pendingIntent = PendingIntent.getActivity(this , 12 , intent , 0)

            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

            val notification = NotificationCompat
                .Builder( this , "myNotif" )
                .setSmallIcon( android.R.drawable.stat_notify_chat )
                .setLargeIcon( BitmapFactory.decodeResource(resources , R.drawable.notif) )
                .setContentTitle("Sam Jefry")
                .setContentText("Let's have a dinner...")
                .setContentIntent(pendingIntent)
                .setStyle(
                    NotificationCompat.InboxStyle()
                        .addLine("salam!")
                        .addLine("khoobi?!")
                        .addLine("seen nemikoni na ??????")
                        .addLine("bye forever :))))")
                )
                .build()

            notificationManager.notify( (10..1000).random() , notification )

        }



    }
}