package ir.MrMohamadHosein.notification

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import ir.MrMohamadHosein.notification.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShow.setOnClickListener {

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
                .build()

            notificationManager.notify( (10..1000).random() , notification )

        }

    }
}